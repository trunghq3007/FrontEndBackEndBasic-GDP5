<?php

use yii\db\Migration;

class m160828_034109_tb_ProductImage extends Migration
{
   public function up()
    {
        $tableOptions = null;
        if ($this->db->driverName === 'mysql') {
            $tableOptions = 'CHARACTER SET utf8 COLLATE utf8_unicode_ci ENGINE=InnoDB';
        }

        $this->createTable('{{%tb_productimage}}', [
            'idImage' => $this->primaryKey(),
            'product_id'=>$this->integer(),
            'large' => $this->string(),
            'medium' => $this->string(),
            'small' => $this->string(),
            'thun' => $this->string(),
            'status' => $this->smallInteger()->notNull()->defaultValue(1),
            'title'=> $this->string(),
        ], $tableOptions);

         //creates addForeignKey tb_productimage tb_product
        $this->createIndex(
            'index_ProductImage',
            'tb_productimage',
            'product_id'
        );

        $this->addForeignKey(
            'fk_Product_Image',
            'tb_productimage',
            'product_id',
            'tb_product',
            'idProduct',
            'CASCADE'
        );
    }

    public function down()
    {
        $this->dropTable('{{%tb_productimage}}');
    }
}

