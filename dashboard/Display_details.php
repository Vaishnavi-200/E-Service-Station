<?php
include('dbconnect.php');
$sql=mysqli_query($conn,"SELECT * FROM TABLE_VSS");


$sql1=mysqli_query($conn,"SELECT * FROM TABLE_VCS");


?>


<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Green Bootstrap Template - Index</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: Green - v4.9.0
  * Template URL: https://bootstrapmade.com/green-free-one-page-bootstrap-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Top Bar ======= -->
  <section id="topbar" class="d-flex align-items-center">
    <div class="container d-flex justify-content-center justify-content-md-between">
      <div class="contact-info d-flex align-items-center">
        <i class="bi bi-envelope-fill"></i><a href="mailto:contact@example.com">info@example.com</a>
        <i class="bi bi-phone-fill phone-icon"></i> 6360775210
      </div>
      <div class="social-links d-none d-md-block">
        <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
        <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
        <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
        <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></i></a>
      </div>
    </div>
  </section>

  <!-- ======= Header ======= -->
  <header id="header" class="d-flex align-items-center">
    <div class="container d-flex align-items-center">

      <h1 class="logo me-auto"><a href="index.html"></a>E SERVICE STATION</h1>
      <!-- Uncomment below if you prefer to use an image logo -->
      <!-- <a href="index.html" class="logo me-auto"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

      <nav id="navbar" class="navbar">
        <ul>
          <li><a class="nav-link scrollto active" href="#hero">Home</a></li>
          <li><a class="nav-link scrollto" href="VehicleService_page.php">Vehicle Service</a></li>
          <li><a class="nav-link scrollto" href="VehicleCharging_page.php">Vehicle Charging</a></li>
          <li><a class="nav-link scrollto " href="Display_details.php">Details</a></li>
          
          
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->

    </div>
  </header><!-- End Header -->

  <!-- ======= Hero Section ======= -->
  <section id="hero">
    <div id="heroCarousel" data-bs-interval="5000" class="carousel slide carousel-fade" data-bs-ride="carousel">

      <ol class="carousel-indicators" id="hero-carousel-indicators"></ol>

      <div class="carousel-inner" role="listbox">

        <!-- Slide 1 -->
        <div class="carousel-item active" style="background-image: url(assets/img/slide/slide-1.jpg)">
          <div class="carousel-container">
            <div class="container">
              <h2 class="animate__animated animate__fadeInDown">WELCOME TO <span>E SERVICE STATION</span></h2>
              <p class="animate__animated animate__fadeInUp">This application provides and delivers end-to-end EV charging,handling both charging and service station operations.The provision of services via internet,thus E service may also include E commerce, although it may also include online service.</p>
            </div>
          </div>
        </div>

        <!-- Slide 2 -->
        <div class="carousel-item" style="background-image: url(assets/img/slide/slide-2.jpg)">
          <div class="carousel-container">
            <div class="container">
              <h2 class="animate__animated animate__fadeInDown">E VEHICLE SERVICE STATION</h2>
              <p class="animate__animated animate__fadeInUp">A vehicle service is a series of maintenance procedures carried out at a certain interval of time.It includes inspection, replacement and adjustment done to identify any electrical components reporting a failure outside of normal conditions</p>
            </div>
          </div>
        </div>

        <!-- Slide 3 -->
        <div class="carousel-item" style="background-image: url(assets/img/slide/slide-3.jpg)">
          <div class="carousel-container">
            <div class="container">
              <h2 class="animate__animated animate__fadeInDown">E VEHICLE CHARGING STATION</h2>
              <p class="animate__animated animate__fadeInUp">A vehicle service is a series of maintenance procedures carried out at a certain interval of time.It includes inspection, replacement and adjustment done to identify any electrical components reporting a failure outside of normal conditions..</p>
            </div>
          </div>
        </div>

      </div>

      <a class="carousel-control-prev" href="#heroCarousel" role="button" data-bs-slide="prev">
        <span class="carousel-control-prev-icon bi bi-chevron-left" aria-hidden="true"></span>
      </a>

      <a class="carousel-control-next" href="#heroCarousel" role="button" data-bs-slide="next">
        <span class="carousel-control-next-icon bi bi-chevron-right" aria-hidden="true"></span>
      </a>

    </div>
  </section><!-- End Hero -->
  <style>
      table,th,td{
          border:2px solid black;
      }
  </style>
  	<center>
  <h2>Vehicle Service</h2>
  <table border=2>
            <tr>
                <th>stationid</th>
                <th>stationname</th>
                <th>city</th>
                <th>address</th>
                <th>mno</th>
                <th>portdetails</th>
                <th>servicecharge</th>
                <th>latitude</th>
                <th>longitude</th>
            </tr>
            <?php
            while($row=mysqli_fetch_array($sql))
           {
            $v1=$row['stationid'];
            $v2=$row['stationname'];
            $v3=$row['city'];
            $v4=$row['address'];
            $v5=$row['mno'];
            $v6=$row['portdetails'];
            $v7=$row['servicecharge'];
            $v8=$row['latitude'];
            $v9=$row['longitude'];
             ?>
            <tr>
           <td><?php echo $v1; ?></td>
           <td><?php echo $v2; ?></td>
           <td><?php echo $v3; ?></td>
           <td><?php echo $v4; ?></td>
           <td><?php echo $v5; ?></td>
           <td><?php echo $v6; ?></td>
           <td><?php echo $v7; ?></td>
           <td><?php echo $v8; ?></td>
           <td><?php echo $v9; ?></td>
           
             </tr>
            <?php
            }
            ?>
    </table>
    </center>  
<center>
  <h2>Vehicle Charging</h2>
  <table border=2>
            <tr>
                <th>stationid</th>
                <th>stationname</th>
                <th>city</th>
                <th>address</th>
                <th>mno</th>
                <th>portdetails</th>
                <th>chargingcharge</th>
                <th>latitude</th>
                <th>longitude</th>
                
                
            
            </tr>
            <?php
            while($row=mysqli_fetch_array($sql1))
           {
            $v1=$row['stationid'];
            $v2=$row['stationname'];
            $v3=$row['city'];
            $v4=$row['address'];
            $v5=$row['mno'];
            $v6=$row['portdetails'];
            $v7=$row['chargingcharge'];
            $v8=$row['latitude'];
            $v9=$row['longitude'];
             ?>
            <tr>
           <td><?php echo $v1; ?></td>
           <td><?php echo $v2; ?></td>
           <td><?php echo $v3; ?></td>
           <td><?php echo $v4; ?></td>
           <td><?php echo $v5; ?></td>
           <td><?php echo $v6; ?></td>
           <td><?php echo $v7; ?></td>
           <td><?php echo $v8; ?></td>
           <td><?php echo $v9; ?></td>
           
             </tr>
            <?php
            }
            ?>
    </table>
    </center> 

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="container">
      <h3>E Service Station</h3>
      <p>Et aut eum quis fuga eos sunt ipsa nihil. Labore corporis magni eligendi fuga maxime saepe commodi placeat.</p>
      <div class="social-links">
        <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
        <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
        <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
        <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
        <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
      </div>
      <div class="copyright">
        &copy; Copyright <strong><span>Green</span></strong>. All Rights Reserved
      </div>
      <div class="credits">
        <!-- All the links in the footer should remain intact. -->
        <!-- You can delete the links only if you purchased the pro version. -->
        <!-- Licensing information: https://bootstrapmade.com/license/ -->
        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/green-free-one-page-bootstrap-template/ -->
        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
      </div>
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>