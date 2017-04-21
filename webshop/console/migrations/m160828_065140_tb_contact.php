<?php

use yii\db\Migration;

class m160828_065140_tb_contact extends Migration
{
   
   public function up()
    {
        $tableOptions = null;
        if ($this->db->driverName === 'mysql') {
            $tableOptions = 'CHARACTER SET utf8 COLLATE utf8_unicode_ci ENGINE=InnoDB';
        }

        $this->createTable('{{%tb_contact}}', [
            'idContact' => $this->primaryKey(),
            'fullName' => $this->string()->notNull(),
            'email' => $this->string(50)->notNull(),
            'title' => $this->string()->notNull(),
            'messenger' => $this->string()->notNull(),
            'status' => $this->smallInteger()->notNull()->defaultValue(1),
            'created_at' => $this->integer()->notNull(),
            'updated_at' => $this->integer()->notNull(),
        ], $tableOptions);
    }

    public function down()
    {
        $this->dropTable('{{%tb_contact}}');
    }
}
