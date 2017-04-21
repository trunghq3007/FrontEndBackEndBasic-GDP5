<?php

use yii\db\Migration;

class m160828_033227_tb_Orders extends Migration
{
   public function up()
    {
        $tableOptions = null;
        if ($this->db->driverName === 'mysql') {
            $tableOptions = 'CHARACTER SET utf8 COLLATE utf8_unicode_ci ENGINE=InnoDB';
        }
        $this->createTable('{{%tb_order}}', [
            'idOrder' => $this->primaryKey(),
            'customerFullName' => $this->string(150)->notNull(),
            'customerName' => $this->string(150)->notNull(),
            'customerProvince_id'=>$this->integer()->notNull(),
            'customerAddress' => $this->string()->notNull(),
            'customerpPhone' => $this->string(15)->notNull(),
            'customerEmail' => $this->string(100), 
            'otherInformation' =>$this->string(),
            'totalMoney'=>$this->float(), 
            'paymen_id'=>$this->integer(),
            'user_id'=> $this->integer(),        
            'status' => $this->integer()->notNull()->defaultValue(1),
            'created_at' => $this->integer()->notNull(),
            'updated_at' => $this->integer()->notNull(),
        ], $tableOptions);


         //creates addForeignKey tb_order tb_payment
        $this->createIndex(
            'index_PaymenOrder',
            'tb_order',
            'paymen_id'
        );

        $this->addForeignKey(
            'fk_PaymenOrder',
            'tb_order',
            'paymen_id',
            'tb_payment',
            'idPayment',
            'CASCADE'
        );

               //creates addForeignKey tb_order user
        $this->createIndex(
            'index_UserOrder',
            'tb_order',
            'user_id'
        );

        $this->addForeignKey(
            'fk_UserOrder',
            'tb_order',
            'user_id',
            'user',
            'id',
            'CASCADE'
        );

    }

    public function down()
    {
        $this->dropTable('{{%tb_order}}');
    }
}
