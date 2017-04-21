<?php

/* @var $this \yii\web\View */
/* @var $content string */

use yii\helpers\Html;
use yii\bootstrap\Nav;
use yii\bootstrap\NavBar;
use yii\widgets\Breadcrumbs;
use frontend\assets\AppAsset;
use common\widgets\Alert;
use frontend\widgets\topMenuWidget;

AppAsset::register($this);
?>
<!DOCTYPE html>
<html lang="<?= Yii::$app->language ?>">
<head>
    <meta charset="<?= Yii::$app->charset ?>">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <?= Html::csrfMetaTags() ?>
    <title><?= Html::encode($this->title) ?></title>
    <?php $this->head() ?>
</head>
<body>
<?php $this->beginBody() ?>
<!-- Navigation & Logo-->
<div class="mainmenu-wrapper">
    <div class="container">
        <div class="menuextras">
            <div class="extras">
                <ul>
                    <li class="shopping-cart-items"><i class="glyphicon glyphicon-shopping-cart icon-white"></i> <a href="page-shopping-cart.html"><b>3 items</b></a></li>
                    <li>
                        <div class="dropdown choose-country">
                            <a class="#" data-toggle="dropdown" href="#"><img src="img/flags/gb.png" alt="Great Britain"> UK</a>
                            <ul class="dropdown-menu" role="menu">
                                <li role="menuitem"><a href="#"><img src="img/flags/us.png" alt="United States"> US</a></li>
                                <li role="menuitem"><a href="#"><img src="img/flags/de.png" alt="Germany"> DE</a></li>
                                <li role="menuitem"><a href="#"><img src="img/flags/es.png" alt="Spain"> ES</a></li>
                            </ul>
                        </div>
                    </li>
                    <li><a href="page-login.html">Login</a></li>
                </ul>
            </div>
        </div>
        <div class="logo-wrapper"><a href="index.html"><img src="img/mPurpose-logo.png" alt="Multipurpose Twitter Bootstrap Template"></a></div>
        <?= topMenuWidget::widget(); ?>
    </div>
</div>

<!-- Page Title -->
<div class="section section-breadcrumbs">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1>Sản Phẩm</h1>
            </div>
        </div>
    </div>
</div>

<div class="eshop-section section">
    <div class="container">
        <div class="row">
            <div class="col-md-3 col-sm-6">
                <!-- Product -->
                <div class="shop-item">
                    <!-- Product Image -->
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product1.jpg" alt="Item Name"></a>
                    </div>
                    <!-- Product Title -->
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <!-- Product Available Colors-->
                    <div class="colors">
                        <span class="color-white"></span>
                        <span class="color-black"></span>
                        <span class="color-blue"></span>
                        <span class="color-orange"></span>
                        <span class="color-green"></span>
                    </div>
                    <!-- Product Price-->
                    <div class="price">
                        $999.99
                    </div>
                    <!-- Add to Cart Button -->
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add to Cart</a>
                    </div>
                </div>
                <!-- End Product -->
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product2.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="colors">
                        <span class="color-white"></span>
                        <span class="color-black"></span>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add to Cart</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product3.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="colors">
                        <span class="color-white"></span>
                        <span class="color-black"></span>
                        <span class="color-blue"></span>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add to Cart</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product4.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="colors">
                        <span class="color-white"></span>
                        <span class="color-black"></span>
                        <span class="color-blue"></span>
                        <span class="color-orange"></span>
                        <span class="color-green"></span>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add to Cart</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product5.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="colors">
                        <span class="color-white"></span>
                        <span class="color-black"></span>
                        <span class="color-blue"></span>
                        <span class="color-orange"></span>
                        <span class="color-green"></span>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add to Cart</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product6.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="colors">
                        <span class="color-white"></span>
                        <span class="color-black"></span>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add to Cart</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product7.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="colors">
                        <span class="color-white"></span>
                        <span class="color-black"></span>
                        <span class="color-red"></span>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add to Cart</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product8.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="colors">
                        <span class="color-white"></span>
                        <span class="color-black"></span>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add to Cart</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="pagination-wrapper ">
            <ul class="pagination pagination-lg">
                <li class="disabled"><a href="#">Previous</a></li>
                <li class="active"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">6</a></li>
                <li><a href="#">7</a></li>
                <li><a href="#">8</a></li>
                <li><a href="#">9</a></li>
                <li><a href="#">10</a></li>
                <li><a href="#">Next</a></li>
            </ul>
        </div>
    </div>
</div>

<div class="eshop-section section">
    <div class="container">
        <h2>Listing With No Colors Information</h2>
        <div class="row">
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product1.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add</a> <span>or <a href="page-product-details.html">Read more</a></span>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product2.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add</a> <span>or <a href="page-product-details.html">Read more</a></span>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product3.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add</a> <span>or <a href="page-product-details.html">Read more</a></span>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product4.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add</a> <span>or <a href="page-product-details.html">Read more</a></span>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product5.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add</a> <span>or <a href="page-product-details.html">Read more</a></span>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product6.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add</a> <span>or <a href="page-product-details.html">Read more</a></span>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product7.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add</a> <span>or <a href="page-product-details.html">Read more</a></span>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="shop-item">
                    <div class="shop-item-image">
                        <a href="page-product-details.html"><img src="img/product8.jpg" alt="Item Name"></a>
                    </div>
                    <div class="title">
                        <h3><a href="page-product-details.html">Lorem ipsum dolor</a></h3>
                    </div>
                    <div class="price">
                        $999.99
                    </div>
                    <div class="actions">
                        <a href="page-product-details.html" class="btn btn-small"><i class="icon-shopping-cart icon-white"></i> Add</a> <span>or <a href="page-product-details.html">Read more</a></span>
                    </div>
                </div>
            </div>
        </div>
        <div class="pagination-wrapper ">
            <ul class="pagination pagination-lg">
                <li class="disabled"><a href="#">Previous</a></li>
                <li class="active"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">6</a></li>
                <li><a href="#">7</a></li>
                <li><a href="#">8</a></li>
                <li><a href="#">9</a></li>
                <li><a href="#">10</a></li>
                <li><a href="#">Next</a></li>
            </ul>
        </div>
    </div>
</div>

<!-- Footer -->
<div class="footer">
    <div class="container">
        <div class="row">
            <div class="col-footer col-md-3 col-xs-6">
                <h3>Our Latest Work</h3>
                <div class="portfolio-item">
                    <div class="portfolio-image">
                        <a href="page-portfolio-item.html"><img src="img/portfolio6.jpg" alt="Project Name"></a>
                    </div>
                </div>
            </div>
            <div class="col-footer col-md-3 col-xs-6">
                <h3>Navigate</h3>
                <ul class="no-list-style footer-navigate-section">
                    <li><a href="page-blog-posts.html">Blog</a></li>
                    <li><a href="page-portfolio-3-columns-2.html">Portfolio</a></li>
                    <li><a href="page-products-3-columns.html">eShop</a></li>
                    <li><a href="page-services-3-columns.html">Services</a></li>
                    <li><a href="page-pricing.html">Pricing</a></li>
                    <li><a href="page-faq.html">FAQ</a></li>
                </ul>
            </div>

            <div class="col-footer col-md-4 col-xs-6">
                <h3>Contacts</h3>
                <p class="contact-us-details">
                    <b>Address:</b> 123 Fake Street, LN1 2ST, London, United Kingdom<br/>
                    <b>Phone:</b> +44 123 654321<br/>
                    <b>Fax:</b> +44 123 654321<br/>
                    <b>Email:</b> <a href="mailto:getintoutch@yourcompanydomain.com">getintoutch@yourcompanydomain.com</a>
                </p>
            </div>
            <div class="col-footer col-md-2 col-xs-6">
                <h3>Stay Connected</h3>
                <ul class="footer-stay-connected no-list-style">
                    <li><a href="#" class="facebook"></a></li>
                    <li><a href="#" class="twitter"></a></li>
                    <li><a href="#" class="googleplus"></a></li>
                </ul>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="footer-copyright">&copy; 2013 mPurpose. All rights reserved.</div>
            </div>
        </div>
    </div>
</div>
<?php $this->endBody() ?>
</body>
</html>
<?php $this->endPage() ?>
