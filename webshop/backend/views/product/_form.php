<?php

use yii\helpers\Html;
use yii\widgets\ActiveForm;

/* @var $this yii\web\View */
/* @var $model backend\models\Product */
/* @var $form yii\widgets\ActiveForm */
?>

<div class="product-form">

    <?php $form = ActiveForm::begin(); ?>

    <?= $form->field($model, 'productName')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'groups')->dropDownList($dataGroup,['prompt'=>'-chọn thư mục-']) ?>

    <?= $form->field($model, 'cate_id')->dropDownList($dataCate,['prompt'=>'-chọn thư mục-']) ?>

    <?= $form->field($model, 'supplires_id')->dropDownList($dataSupp,['prompt'=>'-chọn thư mục-']) ?>

    <?= $form->field($model, 'price')->textInput() ?>

    <?= $form->field($model, 'saleOf')->textInput() ?>

    <?= $form->field($model, 'startSale')->textInput() ?>

    <?= $form->field($model, 'endSale')->textInput() ?>

    <?= $form->field($model, 'priceSale')->textInput() ?>

    <?= $form->field($model, 'quantity')->textInput() ?>

    <?= $form->field($model, 'memory')->textInput() ?>

    <?= $form->field($model, 'system_pro')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'screen_pro')->textInput() ?>
    
    <img src="" alt="" width="100px" id="previewImage">
    <?= $form->field($model, 'image')->textInput(['maxlength' => true,'id'=>'proImg','placeholder'=>'click chọn ảnh']) ?>

    <?= $form->field($model, 'keywords')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'description')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'content')->textarea(['rows' => 6]) ?>

    <?= $form->field($model, 'status')->checkBox() ?>

    <div class="form-group">
        <?= Html::submitButton($model->isNewRecord ? 'Create' : 'Update', ['class' => $model->isNewRecord ? 'btn btn-success' : 'btn btn-primary']) ?>
    </div>

    <?php ActiveForm::end(); ?>

</div>
