<?php

namespace backend\controllers;

use Yii;
use backend\models\Product;
use backend\models\Group;
use backend\models\Category;
use backend\models\Supplier;
use backend\models\ProductSearch;
use yii\web\Controller;
use yii\web\NotFoundHttpException;
use yii\filters\VerbFilter;
use yii\helpers\ArrayHelper;

/**
 * ProductController implements the CRUD actions for Product model.
 */
class ProductController extends Controller
{
    /**
     * @inheritdoc
     */
    public function behaviors()
    {
        return [
            'verbs' => [
                'class' => VerbFilter::className(),
                'actions' => [
                    'delete' => ['POST'],
                ],
            ],
        ];
    }

    /**
     * Lists all Product models.
     * @return mixed
     */
    public function actionIndex()
    {
        $searchModel = new ProductSearch();
        $dataProvider = $searchModel->search(Yii::$app->request->queryParams);

        return $this->render('index', [
            'searchModel' => $searchModel,
            'dataProvider' => $dataProvider,
        ]);
    }

    /**
     * Displays a single Product model.
     * @param integer $id
     * @return mixed
     */
    public function actionView($id)
    {
        return $this->render('view', [
            'model' => $this->findModel($id),
        ]);
    }

    /**
     * Creates a new Product model.
     * If creation is successful, the browser will be redirected to the 'view' page.
     * @return mixed
     */
    public function actionCreate()
    {
        // echo "<pre>";
        // print_r(Yii::$app->user->id);
        // die;
        $model = new Product();
        $group = new Group();
        $dataGroup = ArrayHelper::map($group->getAllGroup(),"idGroups","groupsName");

        $time = time();
        $model->created_at = $time;
        $model->updated_at = $time;

        // $cate = new Category();
        // $dataCate = ArrayHelper::map($cate->getAllCategory(),"idCate","cateName");

        $supp = new Supplier();
        $dataSupp = ArrayHelper::map($supp->getAllSupplier(),"idSupplier","supplierName");


        $model->cate_id = $model->cate_id == '' ? 0 : $model->cate_id;
        $dataCate = $model->getCategoryParent();
        

        $model->user_id = Yii::$app->user->id;

        if (empty($dataCat)) {
            $dataCat = array();
        }
        if ($model->load(Yii::$app->request->post())) {

            $urlImg = Yii::$app->request->post();
            $link = $urlImg["Product"]["image"];
            $link = str_replace("http://localhost:9999/webshop", "", $link);

            $model->image = $link;
            if ($model->save())
            return $this->redirect(['view', 'id' => $model->idProduct]);
        } else {
            return $this->render('create', [
                'model' => $model,
                'dataGroup'=>$dataGroup,
                'dataCate' => $dataCate,
                'dataSupp' => $dataSupp
            ]);
        }
    }

    /**
     * Updates an existing Product model.
     * If update is successful, the browser will be redirected to the 'view' page.
     * @param integer $id
     * @return mixed
     */
    public function actionUpdate($id)
    {
        $model = $this->findModel($id);

        if ($model->load(Yii::$app->request->post()) && $model->save()) {
            return $this->redirect(['view', 'id' => $model->idProduct]);
        } else {
            return $this->render('update', [
                'model' => $model,
            ]);
        }
    }

    /**
     * Deletes an existing Product model.
     * If deletion is successful, the browser will be redirected to the 'index' page.
     * @param integer $id
     * @return mixed
     */
    public function actionDelete($id)
    {
        $this->findModel($id)->delete();

        return $this->redirect(['index']);
    }

    /**
     * Finds the Product model based on its primary key value.
     * If the model is not found, a 404 HTTP exception will be thrown.
     * @param integer $id
     * @return Product the loaded model
     * @throws NotFoundHttpException if the model cannot be found
     */
    protected function findModel($id)
    {
        if (($model = Product::findOne($id)) !== null) {
            return $model;
        } else {
            throw new NotFoundHttpException('The requested page does not exist.');
        }
    }
}
