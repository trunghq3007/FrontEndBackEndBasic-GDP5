<?php

namespace frontend\models;

use Yii;

/**
 * This is the model class for table "tb_category".
 *
 * @property integer $idCate
 * @property string $icon
 * @property string $cateName
 * @property integer $parent_id
 * @property string $keywords
 * @property string $description
 * @property integer $order
 * @property integer $groups_id
 * @property integer $status
 * @property integer $created_at
 * @property integer $updated_at
 *
 * @property TbGroup $groups
 * @property TbNews[] $tbNews
 * @property TbProduct[] $tbProducts
 */
class Category extends \yii\db\ActiveRecord
{
    /**
     * @inheritdoc
     */
    public static function tableName()
    {
        return 'tb_category';
    }

    /**
     * @inheritdoc
     */
    public function rules()
    {
        return [
            [['cateName', 'order', 'groups_id', 'created_at', 'updated_at'], 'required'],
            [['parent_id', 'order', 'groups_id', 'status', 'created_at', 'updated_at'], 'integer'],
            [['icon', 'keywords', 'description'], 'string', 'max' => 255],
            [['cateName'], 'string', 'max' => 150],
            [['cateName'], 'unique'],
            [['groups_id'], 'exist', 'skipOnError' => true, 'targetClass' => Group::className(), 'targetAttribute' => ['groups_id' => 'idGroups']],
        ];
    }

    /**
     * @inheritdoc
     */
    public function attributeLabels()
    {
        return [
            'idCate' => 'Id Cate',
            'icon' => 'Icon',
            'cateName' => 'Cate Name',
            'parent_id' => 'Parent ID',
            'keywords' => 'Keywords',
            'description' => 'Description',
            'order' => 'Order',
            'groups_id' => 'Groups ID',
            'status' => 'Status',
            'created_at' => 'Created At',
            'updated_at' => 'Updated At',
        ];
    }

    /**
     * @return \yii\db\ActiveQuery
     */
    public function getGroups()
    {
        return $this->hasOne(Group::className(), ['idGroups' => 'groups_id']);
    }

    /**
     * @return \yii\db\ActiveQuery
     */
    public function getTbNews()
    {
        return $this->hasMany(News::className(), ['cate_id' => 'idCate']);
    }

    /**
     * @return \yii\db\ActiveQuery
     */
    public function getTbProducts()
    {
        return $this->hasMany(Product::className(), ['cate_id' => 'idCate']);
    }
    public function getCategoryByParent ($parent = 0,$group=1,$status=1)
    {
        $data=Category::find()->asArray()->where('parent_id=:parent AND groups_id =:group AND status=:status',['parent'=>$parent,'group'=>$group,'status'=>$status])->all();
        return $data;
    }
}
