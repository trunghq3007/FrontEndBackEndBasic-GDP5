<?php

use yii\db\Migration;

class m160828_033332_tb_OrderDetails extends Migration
{
    public function up()
    {
        $tableOptions = null;
        if ($this->db->driverName === 'mysql') {
            $tableOptions = 'CHARACTER SET utf8 COLLATE utf8_unicode_ci ENGINE=InnoDB';
        }

        $this->createTable('{{%tb_orderdetail}}', [
            'idOrderDetails' => $this->primaryKey(),
            'productName' => $this->string(150)->notNull()->unique(),
            'image' =>$this->string(),
            'price'=>$this->float()->notNull(),
            'quantity'=>$this->integer()->notNull()->defaultValue(0),
            'totalMoney'=>$this->float(), 
            'size'=>$this->string(50),
            'color'=>$this->string(),
            'order_id'=>$this->integer()->notNull(),
            'created_at' => $this->integer()->notNull(),
            'updated_at' => $this->integer()->notNull(),
        ], $tableOptions);

               //creates addForeignKey tb_orderdetail tb_order
        $this->createIndex(
            'index_OrderOrderdetail',
            'tb_orderdetail',
            'order_id'
        );

        $this->addForeignKey(
            'fk_OrderOrderdetail',
            'tb_orderdetail',
            'order_id',
            'tb_order',
            'idOrder',
            'CASCADE'
        );
    }

    public function down()
    {
        $this->dropTable('{{%tb_orderdetail}}');
    }
}
