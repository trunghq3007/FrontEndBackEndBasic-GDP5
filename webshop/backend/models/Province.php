<?php

namespace backend\models;

use Yii;

/**
 * This is the model class for table "tbl_province".
 *
 * @property integer $provinceID
 * @property string $provinceName
 * @property integer $status
 * @property integer $created_at
 * @property integer $updated_at
 */
class Province extends \yii\db\ActiveRecord
{
    /**
     * @inheritdoc
     */
    public static function tableName()
    {
        return 'tbl_province';
    }

    /**
     * @inheritdoc
     */
    public function rules()
    {
        return [
            [['provinceName', 'created_at', 'updated_at'], 'required'],
            [['status', 'created_at', 'updated_at'], 'integer'],
            [['provinceName'], 'string', 'max' => 255],
            [['provinceName'], 'unique'],
        ];
    }

    /**
     * @inheritdoc
     */
    public function attributeLabels()
    {
        return [
            'provinceID' => 'Province ID',
            'provinceName' => 'Province Name',
            'status' => 'Status',
            'created_at' => 'Created At',
            'updated_at' => 'Updated At',
        ];
    }
}
