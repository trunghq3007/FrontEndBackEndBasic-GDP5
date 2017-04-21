<?php

use yii\db\Migration;

class m160828_033534_tb_Product extends Migration
{
  
   public function up()
    {
        $tableOptions = null;
        if ($this->db->driverName === 'mysql') {
            $tableOptions = 'CHARACTER SET utf8 COLLATE utf8_unicode_ci ENGINE=InnoDB';
        }

        $this->createTable('{{%tb_product}}', [
            'idProduct' => $this->primaryKey(),
            'productName' => $this->string(150)->notNull()->unique(),
            'price'=>$this->integer()->notNull()->defaultValue(0),
            'saleOf'=>$this->integer()->defaultValue(0),
            'startSale'=>$this->integer(),
            'endSale'=>$this->integer(),
            'priceSale'=>$this->integer()->defaultValue(0),
            'quantity'=>$this->integer()->defaultValue(0),

            'memory'=>$this->integer(10),
            'system_pro'=>$this->string(),
            'screen_pro'=>$this->integer(),

            'image' =>$this->string(),
            'keywords' => $this->string(),
            'description'=>$this->string(500),
            'content'=>$this->text(),
            
            'groups' => $this->integer()->notNull()->defaultValue(1),
            'status'=>$this->smallInteger()->notNull()->defaultValue(1),
            'cate_id'=>$this->integer()->notNull(),
            'supplires_id'=>$this->integer()->notNull(),
            'user_id'=>$this->integer()->notNull(),
            'created_at' => $this->integer()->notNull(),
            'updated_at' => $this->integer()->notNull(),
        ], $tableOptions);

          //creates addForeignKey tb_product tb_supplires
        $this->createIndex(
            'index_SuppliresProduct',
            'tb_product',
            'supplires_id'
        );

        $this->addForeignKey(
            'fk_SuppliresProduct',
            'tb_product',
            'supplires_id',
            'tb_supplier',
            'idSupplier',
            'CASCADE'
        );
          //creates addForeignKey tb_product user
        $this->createIndex(
            'index_UserProduct',
            'tb_product',
            'user_id'
        );

        $this->addForeignKey(
            'fk_UserProduct',
            'tb_product',
            'user_id',
            'user',
            'id',
            'CASCADE'
        );
     //  creates addForeignKey tb_product tb_catetory
        $this->createIndex(
         'index_CateProduct',
            'tb_product',
            'cate_id'
        );

        $this->addForeignKey(
            'fk_CateProduct',
            'tb_product',
            'cate_id',
            'tb_category',
            'idCate',
            'CASCADE'
        );
    }

    public function down()
    {
        $this->dropTable('{{%tb_product}}');
    }
}
