<?php

namespace backend\models;

use Yii;

/**
 * This is the model class for table "tb_news".
 *
 * @property integer $idNews
 * @property string $title
 * @property string $image
 * @property string $keyword
 * @property string $description
 * @property string $content
 * @property integer $view
 * @property integer $status
 * @property integer $user_id
 * @property integer $cate_id
 * @property integer $created_at
 * @property integer $updated_at
 *
 * @property TbCategory $cate
 * @property User $user
 */
class News extends \yii\db\ActiveRecord
{
    /**
     * @inheritdoc
     */
    public static function tableName()
    {
        return 'tb_news';
    }

    /**
     * @inheritdoc
     */
    public function rules()
    {
        return [
            [['title', 'keyword', 'content', 'user_id', 'cate_id', 'created_at', 'updated_at'], 'required'],
            [['content'], 'string'],
            [['view', 'status', 'user_id', 'cate_id', 'created_at', 'updated_at'], 'integer'],
            [['title', 'image', 'keyword', 'description'], 'string', 'max' => 255],
            [['cate_id'], 'exist', 'skipOnError' => true, 'targetClass' => Category::className(), 'targetAttribute' => ['cate_id' => 'idCate']],
            [['user_id'], 'exist', 'skipOnError' => true, 'targetClass' => User::className(), 'targetAttribute' => ['user_id' => 'id']],
        ];
    }

    /**
     * @inheritdoc
     */
    public function attributeLabels()
    {
        return [
            'idNews' => 'Id News',
            'title' => 'Title',
            'image' => 'Image',
            'keyword' => 'Keyword',
            'description' => 'Description',
            'content' => 'Content',
            'view' => 'View',
            'status' => 'Status',
            'user_id' => 'User ID',
            'cate_id' => 'Cate ID',
            'created_at' => 'Created At',
            'updated_at' => 'Updated At',
        ];
    }

    /**
     * @return \yii\db\ActiveQuery
     */
    public function getCate()
    {
        return $this->hasOne(Category::className(), ['idCate' => 'cate_id']);
    }

    /**
     * @return \yii\db\ActiveQuery
     */
    public function getUser()
    {
        return $this->hasOne(User::className(), ['id' => 'user_id']);
    }
}
