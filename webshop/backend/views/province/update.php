<?php

use yii\helpers\Html;

/* @var $this yii\web\View */
/* @var $model backend\models\Province */

$this->title = 'Update Province: ' . $model->provinceID;
$this->params['breadcrumbs'][] = ['label' => 'Provinces', 'url' => ['index']];
$this->params['breadcrumbs'][] = ['label' => $model->provinceID, 'url' => ['view', 'id' => $model->provinceID]];
$this->params['breadcrumbs'][] = 'Update';
?>
<div class="province-update">

    <h1><?= Html::encode($this->title) ?></h1>

    <?= $this->render('_form', [
        'model' => $model,
    ]) ?>

</div>
