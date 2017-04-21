<?php  
    namespace frontend\widgets;

    use frontend\models\Category;

    use yii\base\Widget;
    use yii\helpers\Html;

    class topMenuWidget extends Widget
    {
        public $message;

        public function init()
        {
            parent::init();

        }

        public function run()
        {
            $cat = new Category();
            $dataCat = $cat->getAllCategoryParent();
            return $this->render('topMenuWidget',['dataCat'=>$dataCat]);
        }
    }
?>