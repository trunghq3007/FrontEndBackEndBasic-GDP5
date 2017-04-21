<?php

namespace frontend\assets;

use yii\web\AssetBundle;

/**
 * Main frontend application asset bundle.
 */
class AppAsset extends AssetBundle
{
    public $basePath = '@webroot';
    public $baseUrl = '@web';
    public $css = [
    'bootstap/css/bootstrap.min.css',
    'css/webstyle.css',
    



    ];
    public $js = [
        'jquery.com/jquery.js',
        'bootstrap/js/bootstrap.min.js',

    ];
    public $depends = [
        'yii\web\YiiAsset',
        'yii\bootstrap\BootstrapAsset',
    ];
}

