<div class="header-footer container">
                    <nav class="navbar navbar-default" role="navigation">
                        <div class="container">
                            <!-- Brand and toggle get grouped for better mobile display -->
                            <div class="nav-menu">
                                <button type="button" class="navbar-toggle  " data-toggle="collapse" data-target=".navbar-ex1-collapse">
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                            </div>
                        </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse navbar-ex1-collapse">
                            
                          <ul class="nav navbar-nav navbar-left">

                            <li class="active"><a href="#">TRANG CHỦ</a></li>
                            
                               
                                    
                                <?php foreach ($datacat as $key => $value) {
                                    
                                ?>
                             
                            
                            <li class="dropdown">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <?php echo $value["cateName"]; ?>
                              </a>
                              <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Máy tính</a>
                                    <div>
                                        <h4>Hệ điều hành</h4>
                                        <ul>
                                            <li><a href="">éo có gì sất</a></li>
                                            <li><a href="">éo có gì sất</a></li>
                                            <li><a href="">éo có gì sất</a></li>
                                            <li><a href="">éo có gì sất</a></li>
                                        </ul>
                                    </div>
                                </li>
                                <li><a href="#">Phụ kiện máy tính</a></li>
                                <li><a href="#">Điện thoại</a></li>
                                <li><a href="#">phụ kiện điện thoai</a></li>
                                <li><a href="#">sản phẩm nổi bật</a></li>
                                <li><a href="#">sản phẩm mới</a></li>
                                <li><a href="#">sản phẩm khuyến mãi</a></li>
                            </ul>
                        </li>
                        <?php  
                            }
                        ?>
                  
                    </ul>


                </div><!-- /.navbar-collapse -->
            </nav>
        </div>