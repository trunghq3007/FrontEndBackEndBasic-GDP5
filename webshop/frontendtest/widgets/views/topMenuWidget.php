<?php  
    use frontend\models\Category;
?>

<nav id="mainmenu" class="mainmenu">
    <ul>
        <li>
            <a href="index.html">Trang chủ</a>
        </li>
        <?php  
        foreach ($dataCat as $key => $value) {
            ?>
            <li class="has-submenu active">
                <a href="#"><?php echo $value["cateName"]; ?></a>
                <div class="mainmenu-submenu">
                    <div class="mainmenu-submenu-inner"> 
                        <?php  
                            $catSub1 = new Category();
                            $dataCatSub1 = $catSub1->getAllCategoryParent($value["idCate"]);
                            foreach ($dataCatSub1 as $key1 => $value1) {
                        ?>
                        <div>
                            <h4><?php echo  $value1["cateName"] ?></h4>
                            <ul>
                                <?php
                                    $catSub2 = new Category();
                                    $dataCatSub2 = $catSub2->getAllCategoryParent($value1["idCate"]);
                                    foreach ($dataCatSub2 as $key2 => $value2) {
                                ?>
                                <li><a href="index.html"><?php echo $value2["cateName"] ?></a></li>
                                <?php } ?>
                            </ul>
                        </div>
                        <?php } ?>
                    </div><!-- /mainmenu-submenu-inner -->
                </div><!-- /mainmenu-submenu -->
            </li>
            <?php } ?>
        </ul>
    </nav>