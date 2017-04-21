<?php

use yii\db\Migration;

class m160828_033015_tb_Category extends Migration
{
   
   public function up()
    {
        $tableOptions = null;
        if ($this->db->driverName === 'mysql') {
            $tableOptions = 'CHARACTER SET utf8 COLLATE utf8_unicode_ci ENGINE=InnoDB';
        }

        $this->createTable('{{%tb_category}}', [
            'idCate' => $this->primaryKey(),
            'icon' =>$this ->string(),
            'cateName' => $this->string(150)->notNull()->unique(),
            'parent_id'=>$this->integer()->notNull()->defaultValue(0),
            'keywords'=>$this->string(),
            'description'=>$this->string(),
            'order'=>$this->integer()->notNull(),
            'groups_id'=>$this->integer()->notNull(),
            'status' => $this->smallInteger()->notNull()->defaultValue(1),
            'created_at' => $this->integer()->notNull(),
            'updated_at' => $this->integer()->notNull(),
        ], $tableOptions);
       //creates addForeignKey tb_category tb_group
        $this->createIndex(
            'index_GroupCategory',
            'tb_category',
            'groups_id'
        );

        $this->addForeignKey(
            'fk_Group_Category',
            'tb_category',
            'groups_id',
            'tb_group',
            'idGroups',
            'CASCADE'
        );
    }

    public function down()
    {
        $this->dropTable('{{%tb_category}}');
    }
}
