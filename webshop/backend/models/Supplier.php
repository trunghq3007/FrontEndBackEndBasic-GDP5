<?php

namespace backend\models;

use Yii;

/**
 * This is the model class for table "tb_supplier".
 *
 * @property integer $idSupplier
 * @property string $supplierName
 * @property string $theRepresentative
 * @property integer $province_id
 * @property string $addresses
 * @property string $phone
 * @property string $description
 * @property integer $level
 * @property integer $status
 * @property integer $created_at
 * @property integer $updated_at
 *
 * @property TbProduct[] $tbProducts
 */
class Supplier extends \yii\db\ActiveRecord
{
    /**
     * @inheritdoc
     */
    public static function tableName()
    {
        return 'tb_supplier';
    }

    /**
     * @inheritdoc
     */
    public function rules()
    {
        return [
            [['supplierName', 'province_id', 'addresses', 'phone', 'created_at', 'updated_at'], 'required'],
            [['province_id', 'level', 'status', 'created_at', 'updated_at'], 'integer'],
            [['supplierName', 'theRepresentative', 'addresses', 'description'], 'string', 'max' => 255],
            [['phone'], 'string', 'max' => 15],
            [['supplierName'], 'unique'],
        ];
    }

    /**
     * @inheritdoc
     */
    public function attributeLabels()
    {
        return [
            'idSupplier' => 'Id Supplier',
            'supplierName' => 'Supplier Name',
            'theRepresentative' => 'The Representative',
            'province_id' => 'Province ID',
            'addresses' => 'Addresses',
            'phone' => 'Phone',
            'description' => 'Description',
            'level' => 'Level',
            'status' => 'Status',
            'created_at' => 'Created At',
            'updated_at' => 'Updated At',
        ];
    }

    /**
     * @return \yii\db\ActiveQuery
     */
    public function getProducts()
    {
        return $this->hasMany(Product::className(), ['supplires_id' => 'idSupplier']);
    }

    public function getAllSupplier(){
        $data = Supplier::find()
            ->asArray()
            ->all();
            return $data;
    }
}
