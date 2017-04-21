<?php

use yii\helpers\Html;
use yii\widgets\DetailView;

/* @var $this yii\web\View */
/* @var $model backend\models\Product */

$this->title = $model->idProduct;
$this->params['breadcrumbs'][] = ['label' => 'Products', 'url' => ['index']];
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="product-view">

    <h1><?= Html::encode($this->title) ?></h1>

    <p>
        <?= Html::a('Update', ['update', 'id' => $model->idProduct], ['class' => 'btn btn-primary']) ?>
        <?= Html::a('Delete', ['delete', 'id' => $model->idProduct], [
            'class' => 'btn btn-danger',
            'data' => [
                'confirm' => 'Are you sure you want to delete this item?',
                'method' => 'post',
            ],
        ]) ?>
    </p>

    <?= DetailView::widget([
        'model' => $model,
        'attributes' => [
            'idProduct',
            'productName',
            'price',
            'saleOf',
            'startSale',
            'endSale',
            'priceSale',
            'quantity',
            'memory',
            'system_pro',
            'screen_pro',
            'image',
            'keywords',
            'description',
            'content:ntext',
            'groups',
            'status',
            'cate_id',
            'supplires_id',
            'user_id',
            'created_at',
            'updated_at',
        ],
    ]) ?>

</div>
