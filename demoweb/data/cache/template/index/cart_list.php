<?php include(pe_tpl('header.html'));?>
<div id="xp-wrapper">
	<header id="xp-header" class="layout">
		<div class="xp-vresion-three-header layout">
			<div class="xp-top-header layout">
				<div class="container">
					<div class="row">
						<div class="col-md-8 col-sm-8 col-xs-8">
							<div class="xp-top-location clearfix">
								<ul class="clearfix">
									<li><i class="fa fa-envelope"></i>
										<a href="#">admin@ustc.edu.com</a>
									</li>
									<li><i class="fa fa-phone"></i>
										<a href="#">0551-63601558</a>
									</li>
									<li><i class="fa fa-map-marker"></i>
										<a href="#">Hefei,Anhui,China.</a>
									</li>
								</ul>
							</div>
						</div>
						<div class="col-md-4 col-sm-4 col-xs-4">
							<div class="xp-cart-item clearfix">
								<div class="xp-image-holder">
									<div class="child-pernt">
										<div class="child">
											<img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/cart-icon.png" alt="" />
										</div>
									</div>
									<a href="<?php echo pe_url('cart') ?>"><i class="fa fa-sort-desc"></i></a>
								</div>
								<div class="xp-text-box">
									<p>My Cart <?php echo user_cartnum() ?> item</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="xp-last-header layout">
				<div class="container">
					<div class="xp-last-heade-inner">
						<div class="row">
							<div class="col-md-3 col-sm-3 col-xs-12">
								<div class="xp-logo">
									<a href="<?php echo $pe['host_root'] ?>"><img src="<?php echo pe_thumb($cache_setting['web_logo']) ?>" alt="" /></a>
								</div>
							</div>
							<div class="col-md-9 col-sm-9 col-xs-12">
								<div class="xp-navigation">
									<div class="navbar navbar-default" role="navigation">
										<div class="navbar-header">
											<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                                                        <span class="sr-only">Toggle navigation</span>
                                                        <span class="icon-bar"></span>
                                                        <span class="icon-bar"></span>
                                                        <span class="icon-bar"></span>
                                                    </button>
										</div>
										<div class="navbar-collapse collapse">
											<ul class="nav navbar-nav pull-right">
												<li>
													<a href="<?php echo $pe['host_root'] ?>">Home</a>
												</li>
												<li>
													<a href="#">Shop</a>
													<div class="xp-sub-menu">
														<ul>
															<li>
																<a href="<?php echo pe_url('product-list') ?>">our products</a>
															</li>
															<li>
																<a href="products-details.html">products details</a>
															</li>
															<li>
																<a href="<?php echo pe_url('cart') ?>">cart</a>
															</li>
															<li>
																<a href="checkout.html">checkout</a>
															</li>
														</ul>
													</div>
												</li>
												<li>
													<a href="our-causes-detail.html">Causes Detail</a>
												</li>
												<li>
													<a href="<?php echo pe_url('product-list') ?>">Gallery</a>
												</li>
												<li>
													<a href="<?php echo pe_url('article') ?>">About</a>
												</li>
												<li>
													<a href="contact-us.html">Contact</a>
												</li>
											</ul>
										</div>
										<!--/.nav-collapse -->
									</div>
									<div class="xp-donait-now">
										<a href="#">Donate Now</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<section id="xp-banner" class="layout">
		<div class="xp-inner-banner xp-all-inner-banner" data-parallax="scroll" data-image-src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/all-inner-banner.jpg">
			<div class="xp-ovrlay"></div>
			<div class="xp-text-box">
				<div class="child-pernt">
					<div class="child">
						<div class="container">
							<div class="row">
								<div class="col-md-12">
									<div class="xp-text-box-innr">
										<h1>cart detail</h1>
										<p>Can you Support US</p>
										<ol class="breadcrumb">
											<li>
												<a href="index.html">Home</a>
											</li>
											<li class="active">cart detail</li>
										</ol>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<main class="main-section layout">
		<section class="section-padding layout">
			<div class="container">
				<div class="xp-cart layout">
					<div class="row">
						<div class="col-md-12">
							<div class="xp-cart-table">
								<div class="table-holder">
									<table>
										<thead>
											<tr>
												<th>Product Detail</th>
												<th>Price</th>
												<th>Quantity</th>
												<th>Price</th>
											</tr>
										</thead>
										<tbody>
											<?php foreach($info_list as $k=>$v):?>
											<tr>
												<td>
													<div class="xp-image-holder">
														<img src="<?php echo pe_thumb($v['product_logo'], 100, 100) ?>" alt="" />
													</div>
													<div class="xp-text-box">
														<h3><a href="#"><?php echo $v['product_name'] ?></a></h3>
													</div>
												</td>
												<td>$<?php echo $v['product_money'] ?></td>
												<td>
													<div class="input-group spinner" data-trigger="spinner">
														<input id="quantity" type="text" class="form-control text-center" name="cart_<?php echo $v['cart_id'] ?>" value="<?php echo $v['product_num'] ?>" data-rule="quantity">
														<div class="input-group-addon">
															<a onclick="cart_edit('+', '<?php echo $v['cart_id'] ?>');" href="javascript:;" class="spin-up" data-spin="up"><i class="fa fa-caret-up"></i></a>
															<a onclick="cart_edit('-', '<?php echo $v['cart_id'] ?>');" href="javascript:;" class="spin-down" data-spin="down"><i class="fa fa-caret-down"></i></a>
														</div>
													</div>
													<script type="text/javascript">
														//购物车修改
														function cart_edit(type, cart_id) {
															var _this = $("#quantity");
															if(type == 'del') {
																var num = 0;
															} else {
																var num = parseInt(_this.val());
																num = type == '+' ? num + 1 : (num >= 1 ? num - 1 : 0);
															}
															if(num == 0) {
																if(confirm('您确认要删除该商品吗?') == false) return;
															}
															$.getJSON("<?php echo $pe['host_root'] ?>index.php", {
																"mod": "cart",
																"act": "edit",
																"id": cart_id,
																"num": num
															}, function(json) {
																if(json.result) {
																	_this.val(num);
																	if(num == 0) _this.parents(".js_cart").remove();
																	cart_callback();
																}
															})
														}
													</script>
												</td>
												<td class="xp-price">$<?php echo $v['product_money'] ?></td>
											</tr>
											<?php endforeach;?>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-7 col-sm-7 col-xs-7 pull-right">
							<div class="xp-cart-total">
								<table>
									<tbody>
										<tr>
											<td>Sub total:</td>
											<td>$ <?php echo $money['order_money'] ?></td>
										</tr>
										<tr>
											<td>Shipping:</td>
											<td>Free</td>
										</tr>
										<tr>
											<td>Total:</td>
											<td>$ <?php echo $money['order_money'] ?></td>
										</tr>
									</tbody>
								</table>
								<a class="btn" href="checkout.html">Proceed To Checkout</a>
							</div>
						</div>
						<div class="col-md-5 col-sm-5 col-xs-5">
							<div class="xp-cart-discount">
								<h3>Discount</h3>
								<p>Enter a coupin code below to apply it</p>
								<form>
									<input type="text" placeholder="Coupon Code" />
									<input class="btn" type="submit" value="Apply Coupon" />
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</main>
	<footer id="footer" class="layout">
		<div class="footer section-padding layout" data-parallax="scroll" data-image-src="images/footer-bg.jpg">
			<div class="xp-ovrlay"></div>
			<div class="container">
				<div class="row">
					<div class="col-md-3 col-sm-4 col-xs-6">
						<div class="footer-inner layout">
							<h3><span></span>flickr widget</h3>
							<div class="footer-flicker layout">
								<ul class="layout">
									<li>
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-flickr-img1.jpg" alt=""></a>
									</li>
									<li>
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-flickr-img2.jpg" alt=""></a>
									</li>
									<li>
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-flickr-img3.jpg" alt=""></a>
									</li>
									<li>
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-flickr-img4.jpg" alt=""></a>
									</li>
									<li>
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-flickr-img5.jpg" alt=""></a>
									</li>
									<li>
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-flickr-img6.jpg" alt=""></a>
									</li>
									<li>
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-flickr-img7.jpg" alt=""></a>
									</li>
									<li>
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-flickr-img8.jpg" alt=""></a>
									</li>
									<li>
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-flickr-img9.jpg" alt=""></a>
									</li>
								</ul>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-4 col-xs-6">
						<div class="footer-inner layout">
							<h3><span></span>Help Compains</h3>
							<div class="footer-help-comanis layout">
								<ul class="layout">
									<li>
										<div class="xp-shapes"></div>
										<a href="#">What's the structure ads?</a>
									</li>
									<li>
										<div class="xp-shapes"></div>
										<a href="#">Campaign Builder Terminology</a>
									</li>
									<li>
										<div class="xp-shapes"></div>
										<a href="#">create up to 5000 campaigns.</a>
									</li>
									<li>
										<div class="xp-shapes"></div>
										<a href="#">Hugely Successful when it Comes</a>
									</li>
									<li>
										<div class="xp-shapes"></div>
										<a href="#">Strong and can be Attributed</a>
									</li>
									<li>
										<div class="xp-shapes"></div>
										<a href="#">The Fight For Women's Care</a>
									</li>
								</ul>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-4 col-xs-6">
						<div class="footer-inner layout">
							<h3><span></span>Latest News</h3>
							<div class="footer-latest-news layout">
								<div class="footer-latest-inner layout">
									<div class="xp-image-holder">
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-latest-news-img1.jpg" alt="" /></a>
									</div>
									<div class="xp-text-box">
										<span>24 December 2017</span>
										<h4><a href="#">Protection and Social Inclusion</a></h4>
									</div>
								</div>
								<div class="footer-latest-inner layout">
									<div class="xp-image-holder">
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-latest-news-img2.jpg" alt="" /></a>
									</div>
									<div class="xp-text-box">
										<span>24 December 2017</span>
										<h4><a href="#">through sponsored moustache</a></h4>
									</div>
								</div>
								<div class="footer-latest-inner  layout">
									<div class="xp-image-holder">
										<a href="#"><img src="<?php echo $pe['host_root'] ?>template/mytemplate/index/images/footer-latest-news-img3.jpg" alt="" /></a>
									</div>
									<div class="xp-text-box">
										<span>24 December 2017</span>
										<h4><a href="#">based on shared humour</a></h4>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 col-xs-6">
						<div class="footer-inner layout">
							<h3><span></span>About Pain</h3>
							<div class="footer-pain layout">
								<p>Rem iplsum dolor amet, consectetuer adipiscingelit, sed diam nonummy nib euismod tincidu laoreet dolore magna aliquam erat volutpat euimod....</p>
								<ul>
									<li>
										<a href="#"><i class="fa fa-phone"></i></a>
									</li>
									<li>
										<a href="#"><i class="fa fa-map-marker"></i></a>
									</li>
									<li>
										<a href="#"><i class="fa fa-envelope"></i></a>
									</li>
								</ul>
								<p>Address: University of Science and Technology of China, No.96, 
                                        	JinZhai Road Baohe District. </p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<section class="xp-copyright layout">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
                      <p>Copyright &copy; 2017. BDAA All rights reserved .<a target="_blank" href="#"> Financial Group</a></p>
					</div>
				</div>
			</div>
		</section>
	</footer>
</div>

<?php include(pe_tpl('footer.html'));?>