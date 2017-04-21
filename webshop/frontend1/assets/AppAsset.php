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
        'css/font-awesome.min.css',
        'css/animate.css',
        'css/font.css',
        'css/li-scroller.css',
        'css/slick.css',
        'css/jquery.fancybox.css',
        'css/theme.css',
        'css/style.css',
    ];
    public $js = [
        'js/jquery.min.js',
        'js/wow.min.js',    
        'js/bootstrap.min.js',
        'js/slick.min.js',
        'js/jquery.li-scroller.1.0.js',
        'js/jquery.newsTicker.min.js',
        'js/jquery.fancybox.pack.js',
        'js/custom.js',
    ];
    public $depends = [
        'yii\web\YiiAsset',
        'yii\bootstrap\BootstrapAsset',
    ];
}
