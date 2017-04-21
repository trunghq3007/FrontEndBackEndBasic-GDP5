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
        'css/bootstrap.min.css',
        'css/icomoon-social.css',
        'css/leaflet.css',
        'css/leaflet.ie.css',
        'css/main.css'

    ];
    public $js = [
        'js/modernizr-2.6.2-respond-1.1.0.min.js',
        'js/bootstrap.min.js',
        'js/leaflet.js',
        'js/jquery.fitvids.js',
        'js/jquery.sequence-min.js',
        'js/jquery.bxslider.js',
        'js/main-menu.js',
        'js/template.js'
    ];
    public $depends = [
        'yii\web\YiiAsset',
        'yii\bootstrap\BootstrapAsset',
    ];
}
