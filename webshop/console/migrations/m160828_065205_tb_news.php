<?php

use yii\db\Migration;

class m160828_065205_tb_news extends Migration
{
   
   public function up()
    {
        $tableOptions = null;
        if ($this->db->driverName === 'mysql') {
            $tableOptions = 'CHARACTER SET utf8 COLLATE utf8_unicode_ci ENGINE=InnoDB';
        }

        $this->createTable('{{%tb_news}}', [
            'idNews' => $this->primaryKey(),
            'title' => $this->string()->notNull(),
            'image' => $this->string(),
            'keyword' => $this->string()->notNull(),
            'description'=>$this->string(),
            'content' => $this->text()->notNull(),
            'view'=> $this->integer()->defaultValue(0),
            'status' => $this->smallInteger()->notNull()->defaultValue(1),
            'user_id'=>$this->integer()->notNull(),
            'cate_id'=>$this->integer()->notNull(),
            'created_at' => $this->integer()->notNull(),
            'updated_at' => $this->integer()->notNull(),
        ], $tableOptions);
                     //creates addForeignKey tb_news user
        $this->createIndex(
            'index_UserNews',
            'tb_news',
            'user_id'
        );

        $this->addForeignKey(
            'fk_UserNews',
            'tb_news',
            'user_id',
            'user',
            'id',
            'CASCADE'
        );
                     //creates addForeignKey tb_news tb_category
        $this->createIndex(
            'index_CatetoryNews',
            'tb_news',
            'cate_id'
        );

        $this->addForeignKey(
            'fk_CatetoryNews',
            'tb_news',
            'cate_id',
            'tb_category',
            'idCate',
            'CASCADE'
        );

    }

    public function down()
    {
        $this->dropTable('{{%tb_news}}');
    }
}
