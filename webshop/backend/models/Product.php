<?php

namespace backend\models;

use Yii;

/**
 * This is the model class for table "tb_product".
 *
 * @property integer $idProduct
 * @property string $productName
 * @property integer $price
 * @property integer $saleOf
 * @property integer $startSale
 * @property integer $endSale
 * @property integer $priceSale
 * @property integer $quantity
 * @property integer $memory
 * @property string $system_pro
 * @property integer $screen_pro
 * @property string $image
 * @property string $keywords
 * @property string $description
 * @property string $content
 * @property integer $groups
 * @property integer $status
 * @property integer $cate_id
 * @property integer $supplires_id
 * @property integer $user_id
 * @property integer $created_at
 * @property integer $updated_at
 *
 * @property TbCategory $cate
 * @property TbSupplier $supplires
 * @property User $user
 * @property TbProductimage[] $tbProductimages
 */
class Product extends \yii\db\ActiveRecord
{
    /**
     * @inheritdoc
     */
    public static function tableName()
    {
        return 'tb_product';
    }

    /**
     * @inheritdoc
     */
    public function rules()
    {
        return [
            [['productName', 'cate_id', 'supplires_id', 'user_id', 'created_at', 'updated_at'], 'required','message'=> '{attribute} không được để trống'],
            [['price', 'saleOf', 'priceSale', 'quantity', 'memory', 'screen_pro', 'groups', 'status', 'cate_id', 'supplires_id', 'user_id', 'created_at', 'updated_at'], 'integer'],
            [['startSale', 'endSale'], 'safe'],
            [['content'], 'string'],
            [['productName'], 'string', 'max' => 150],
            [['system_pro', 'image', 'keywords'], 'string', 'max' => 255],
            [['description'], 'string', 'max' => 500],
            [['productName'], 'unique'],
            [['cate_id'], 'exist', 'skipOnError' => true, 'targetClass' => Category::className(), 'targetAttribute' => ['cate_id' => 'idCate']],
            [['supplires_id'], 'exist', 'skipOnError' => true, 'targetClass' => Supplier::className(), 'targetAttribute' => ['supplires_id' => 'idSupplier']],
            [['user_id'], 'exist', 'skipOnError' => true, 'targetClass' => User::className(), 'targetAttribute' => ['user_id' => 'id']],
        ];
    }

    /**
     * @inheritdoc
     */
    public function attributeLabels()
    {
        return [
            'idProduct' => 'Id Product',
            'productName' => 'Tên sản phẩm',
            'price' => 'Giá',
            'saleOf' => 'Giảm giá',
            'startSale' => 'Ngày bắt đầu sale',
            'endSale' => 'Ngày kết thúc sale',
            'priceSale' => 'Price Sale',
            'quantity' => 'Số lượng',
            'memory' => 'Memory',
            'system_pro' => 'System Pro',
            'screen_pro' => 'Screen Pro',
            'image' => 'Image',
            'keywords' => 'Keywords',
            'description' => 'Description',
            'content' => 'Content',
            'groups' => 'Groups',
            'status' => 'Status',
            'cate_id' => 'Cate ID',
            'supplires_id' => 'Supplires ID',
            'user_id' => 'User ID',
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
    public function getSupplires()
    {
        return $this->hasOne(Supplier::className(), ['idSupplier' => 'supplires_id']);
    }

    /**
     * @return \yii\db\ActiveQuery
     */
    public function getUser()
    {
        return $this->hasOne(User::className(), ['id' => 'user_id']);
    }

    /**
     * @return \yii\db\ActiveQuery
     */
    public function getTbProductimages()
    {
        return $this->hasMany(Productimage::className(), ['product_id' => 'idProduct']);
    }

    public $data;
    public function getCategoryParent($parent = 0, $level = ""){
            $result = Category::find()->asArray()->where('parent_id =:parent',['parent'=>$parent])->all();
            $level .="-|--";
            foreach ($result as $key => $value) {
                if ($parent == 0) {
                    $level = "";
                }
                $this->data[$value["idCate"]] = $level.$value["cateName"];
                self::getCategoryParent($value["idCate"], $level);
            }
            return $this->data;
        
    }
}
