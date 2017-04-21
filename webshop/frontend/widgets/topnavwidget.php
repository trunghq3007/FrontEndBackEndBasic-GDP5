<?php 
	namespace frontend\Widgets;

use yii\base\Widget;
use yii\helpers\Html;
use frontend\models\Category;
class topnavwidget extends Widget
{
    public $message;

    public function init()
    {
        parent::init();
       
    }

    public function run()

    {
    	$cat= new Category();
    	$data = $cat->getCategoryByParent();
       
        return $this->render('topnavwidget',['datacat'=>$data]);
    }
}
 ?>