<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>

 	<link href="<c:url value="/bootstrap/bootstrap.css" />" rel="stylesheet">
	<link href="<c:url value="/css/gOooL.css" />" rel="stylesheet">
	<link href="<c:url value="/font-awesome/css/font-awesome.min.css" />" rel="stylesheet">
	
	<script data-require="jquery@3.0.0" data-semver="3.0.0" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.js"></script>
	<script src="<c:url value="/bootstrap/bootstrap.min.js" />"></script>

	<script>
	
		$(document).ready(function() {
			
			$('.portfolio-link').on('click', function(){
				
				/*$("#portfolioModal1").load('/SpringHibernate/main/popup', '', function() {
					$("#portfolioModal1").modal();
				});*/
			});
		});
		
		function goPopup(seq) {
			
			$("#portfolioModal1").load('/SpringHibernate/main/popup', {seq : seq}, function() {
				$("#portfolioModal1").modal();
			});
		}
	</script>
	
</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top topnav" role="navigation">
    
        <div class="container topnav">
            
            <div class="navbar-header">
                <a class="navbar-brand topnav" href="#">gOooL</a>
            </div>
            
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="#about">About</a>
                    </li>
                    <li>
                        <a href="#services">Services</a>
                    </li>
                </ul>
            </div>
            
        </div>
        
    </nav>
	<!-- Navigation -->
	
    <!-- Header -->
    <a name="about"></a>
    
    <div class="intro-header">
    
        <div class="container">

            <div class="row">
                <div class="col-lg-12">
                    <div class="intro-message">
                        <h1>gOooL</h1>
                        <h3>take me somewhere nice</h3>
                        <hr class="intro-divider">
                        <ul class="list-inline intro-social-buttons">
                            <li>
                                <a href="https://twitter.com/SBootstrap" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                            </li>
                            <li>
                                <a href="https://github.com/IronSummitMedia/startbootstrap" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                            </li>
                            <li>
                                <a href="#" class="btn btn-default btn-lg"><i class="fa fa-linkedin fa-fw"></i> <span class="network-name">Linkedin</span></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>

    </div>
	<!-- Header -->

    <!-- content -->
	<a name="services"></a>

	<c:forEach items="${aBoard}" var="aBoard" varStatus="idx">
		
		<c:if test="${idx.count % 2 == 1}">
		
		<div class="content-section-a">
	        <div class="container">
	            <div class="row">
	                <div class="col-lg-5 col-sm-6">
	                    <hr class="section-heading-spacer">
	                    <div class="clearfix"></div>
	                    <h2 class="section-heading">${aBoard.title}</h2>
	                    <p class="lead">${aBoard.content}</p>
	                </div>
	                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
	                    <img class="img-responsive" src="img/ipad.png" alt="">
	                </div>
	            </div>
	        </div>
    	</div>

		</c:if>

		<c:if test="${idx.count % 2 == 0}">
		
   		<div class="content-section-b">
	        <div class="container">
	            <div class="row">
	                <div class="col-lg-5 col-lg-offset-1 col-sm-push-6  col-sm-6">
	                    <hr class="section-heading-spacer">
	                    <div class="clearfix"></div>
	                    <h2 class="section-heading">${aBoard.title}</h2>
	                    <p class="lead">${aBoard.content}</p>
	                </div>
	                <div class="col-lg-5 col-sm-pull-6  col-sm-6">
	                    <img class="img-responsive" src="img/dog.png" alt="">
	                </div>
	            </div>
			</div>
        </div>
        		
		</c:if>
		
	</c:forEach>
	
	<%--	
    <div class="content-section-a">
        <div class="container">
            <div class="row">
                <div class="col-lg-5 col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">Death to the Stock Photo:<br>Special Thanks</h2>
                    <p class="lead">A special thanks to <a target="_blank" href="http://join.deathtothestockphoto.com/">Death to the Stock Photo</a> for providing the photographs that you see in this template. Visit their website to become a member.</p>
                </div>
                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
                    <img class="img-responsive" src="img/ipad.png" alt="">
                </div>
            </div>

        </div>
    </div>

    <div class="content-section-b">
        <div class="container">
            <div class="row">
                <div class="col-lg-5 col-lg-offset-1 col-sm-push-6  col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">3D Device Mockups<br>by PSDCovers</h2>
                    <p class="lead">Turn your 2D designs into high quality, 3D product shots in seconds using free Photoshop actions by <a target="_blank" href="http://www.psdcovers.com/">PSDCovers</a>! Visit their website to download some of their awesome, free photoshop actions!</p>
                </div>
                <div class="col-lg-5 col-sm-pull-6  col-sm-6">
                    <img class="img-responsive" src="img/dog.png" alt="">
                </div>
            </div>
        </div>
    </div>
    --%> 
    <!-- content -->

	<!-- content2 -->    
    <section id="portfolio" class="bg-light-gray">
    
        <div class="container">
        
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Portfolio</h2>
                    <h3 class="section-subheading text-muted">Lorem ipsum dolor sit amet consectetur.</h3>
                </div>
            </div>
            
            <div class="row">
            
            	<c:forEach items="${bBoard}" var="bBoard">

                <div class="col-md-4 col-sm-6 portfolio-item">
                    <!-- <a href="#portfolioModal1" class="portfolio-link" data-toggle="modal"> -->
                    <a class="portfolio-link" data-toggle="modal" onClick="goPopup('${bBoard.seq}')">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/aaa/portfolio/${bBoard.image}" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>${bBoard.title}</h4>
                        <p class="text-muted">${bBoard.subTitle}</p>
                    </div>
                </div>

				</c:forEach>
				                
            	<%--
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <!-- <a href="#portfolioModal1" class="portfolio-link" data-toggle="modal"> -->
                    <a class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/aaa/portfolio/roundicons.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Round Icons</h4>
                        <p class="text-muted">Graphic Design</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal2" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/aaa/portfolio/startup-framework.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Startup Framework</h4>
                        <p class="text-muted">Website Design</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal3" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/aaa/portfolio/treehouse.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Treehouse</h4>
                        <p class="text-muted">Website Design</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal4" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/aaa/portfolio/golden.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Golden</h4>
                        <p class="text-muted">Website Design</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal5" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/aaa/portfolio/escape.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Escape</h4>
                        <p class="text-muted">Website Design</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal6" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/aaa/portfolio/dreams.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>Dreams</h4>
                        <p class="text-muted">Website Design</p>
                    </div>
                </div>
                 --%>
            </div>
            
        </div>
        
    </section>
    <!-- content2 -->
    
    <!-- footer -->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <span class="copyright">Copyright &copy; Your Website 2016</span>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <ul class="list-inline social-buttons">
                        <li><a href="#"><i class="fa fa-twitter"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-facebook"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
    <!-- footer -->
    
    
    
    <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-hidden="true">
<!--         <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                Project Details Go Here
                                <h2>Project Name</h2>
                                <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                                <img class="img-responsive img-centered" src="img/aaa/portfolio/roundicons-free.png" alt="">
                                <p>Use this area to describe your project. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Est blanditiis dolorem culpa incidunt minus dignissimos deserunt repellat aperiam quasi sunt officia expedita beatae cupiditate, maiores repudiandae, nostrum, reiciendis facere nemo!</p>
                                <p>
                                    <strong>Want these icons in this portfolio item sample?</strong>You can download 60 of them for free, courtesy of <a href="https://getdpd.com/cart/hoplink/18076?referrer=bvbo4kax5k8ogc">RoundIcons.com</a>, or you can purchase the 1500 icon set <a href="https://getdpd.com/cart/hoplink/18076?referrer=bvbo4kax5k8ogc">here</a>.</p>
                                <ul class="list-inline">
                                    <li>Date: July 2014</li>
                                    <li>Client: Round Icons</li>
                                    <li>Category: Graphic Design</li>
                                </ul>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Close Project</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
 -->    
 	</div>
    
    
</body>

</html>