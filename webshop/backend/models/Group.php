<?php

namespace backend\models;

use Yii;

/**
 * This is the model class for table "tb_group".
 *
 * @property integer $idGroups
 * @property string $groupsName
 * @property integer $status
 * @property integer $created_at
 * @property integer $updated_at
 *
 * @property TbCategory[] $tbCategories
 */
class Group extends \yii\db\ActiveRecord
{
    /**
     * @inheritdoc
     */
    public static function tableName()
    {
        return 'tb_group';
    }

    /**
     * @inheritdoc
     */
    public function rules()
    {
        return [
            [['groupsName', 'created_at', 'updated_at'], 'required'],
            [['status', 'created_at', 'updated_at'], 'integer'],
            [['groupsName'], 'string', 'max' => 255],
            [['groupsName'], 'unique'],
        ];
    }

    /**
     * @inheritdoc
     */
    public function attributeLabels()
    {
        return [
            'idGroups' => 'Id Groups',
            'groupsName' => 'Groups Name',
            'status' => 'Status',
            'created_at' => 'Created At',
            'updated_at' => 'Updated At',
        ];
    }

    /**
     * @return \yii\db\ActiveQuery
     */
    public function getTbCategories()
    {
        return $this->hasMany(TbCategory::className(), ['groups_id' => 'idGroups']);
    }
    public function getAllGroup(){
        $data = Group::find()
            ->where(['status'=>'1'])
            ->asArray()
            ->all();
            return $data;
    }
}
