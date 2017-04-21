<?php

use yii\db\Migration;

class m160828_033342_tb_Suppliers extends Migration
{
   
   public function up()
    {
        $tableOptions = null;
        if ($this->db->driverName === 'mysql') {
            $tableOptions = 'CHARACTER SET utf8 COLLATE utf8_unicode_ci ENGINE=InnoDB';
        }

        $this->createTable('{{%tb_supplier}}', [
            'idSupplier' => $this->primaryKey(),
            'supplierName' => $this->string()->notNull()->unique(),
            'theRepresentative'=>$this->string(),
            'province_id'=>$this->integer()->notNull(), 
            'addresses'=> $this->string()->notNull(),
            'phone'=> $this->string(15)->notNull(), 
            'description'=>$this ->string(),
            'level'=> $this->smallInteger()->notNull()->defaultValue(0),
            'status' => $this->smallInteger()->notNull()->defaultValue(1),
            'created_at' => $this->integer()->notNull(),
            'updated_at' => $this->integer()->notNull(),
        ], $tableOptions);
    }

    public function down()
    {
        $this->dropTable('{{%tb_supplier}}');
    }
}

