<!DOCTYPE html>
<html class lang="es" ng-app="myApp">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>PROYECTO G</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
   

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">
    


    <!-- Morris Charts CSS -->
    <link href="css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
       <style type="text/css">
    ul>li, a{cursor: pointer;}
    </style>

</head>

<body>








    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">PROYECTO G</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    
                    <ul class="dropdown-menu message-dropdown">
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-footer">
                            <a href="#">Read All New Messages</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    
                    <ul class="dropdown-menu alert-dropdown">
                        <li>
                            <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">View All</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> 
 


                     <b class="caret"></b></a>
                    <ul class="dropdown-menu">
<li>
<a href="logout.php"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens ES EL MENU DE LA IZQUIERDA -->
   
   
   
   
   
 <!-- ---------------------Ménu para admnistrador------------------ -->   
<div class="container">

           <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="index.jsp"><i class="fa fa-fw fa-dashboard"></i> Menú</a>
                    </li>
                         <li>
                                <a href="javascript:;" data-toggle="collapse" data-target="#clientes"><i class="fa fa-fw fa-arrows-v"></i>Clientes<i class="fa fa-fw fa-caret-down"></i></a>
                                    <ul id="clientes" class="collapse">                        
                                        <li><a href="altacustomers.jsp">Alta</a></li>
                                        <li><a href="ControladorG?pagina=consultaCustomer">Consulta</a></li>
                                        <li><a href="actualizarcustomers.jsp">Actualizar</a></li>
                                        <li><a href="borrarcustomer.jsp">Borrar</a></li>
                                    </ul>
                         </li>
                         
                         
                         
                         <li>
                                <a href="javascript:;" data-toggle="collapse" data-target="#empleados"><i class="fa fa-fw fa-arrows-v"></i>Empleados<i class="fa fa-fw fa-caret-down"></i></a>
                                    <ul id="empleados" class="collapse">                        
                                        <li><a href="altaempleados.jsp">Alta</a></li>
                                        <li><a href="ControladorG?pagina=consultaEmployess">Consulta</a></li>
                                        <li><a href="actualizarcustomers.jsp">Actualizar</a></li>
                                        <li><a href="borrarcustomer.jsp">Borrar</a></li>
                                    </ul>
                         </li>
                         
                           <li>
                                <a href="javascript:;" data-toggle="collapse" data-target="#oficinas"><i class="fa fa-fw fa-arrows-v"></i>Oficinas<i class="fa fa-fw fa-caret-down"></i></a>
                                    <ul id="oficinas" class="collapse">                        
                                        <li><a href="altaoficina.jsp">Alta</a></li>
                                        <li><a href="ControladorG?pagina=consultaOffice">Consulta</a></li>
                                        <li><a href="actualizaroffices.jsp">Actualizar</a></li>
                                        <li><a href="borraroffices.jsp">Borrar</a></li>
                                    </ul>
                         </li>
                         
                           <li>
                                <a href="javascript:;" data-toggle="collapse" data-target="#detallaor"><i class="fa fa-fw fa-arrows-v"></i>Detalle de Ordenes<i class="fa fa-fw fa-caret-down"></i></a>
                                    <ul id="detallaor" class="collapse">                        
                                        <li><a href="altaordersdetails.jsp">Alta</a></li>
                                        <li><a href="ControladorG?pagina=consultaOrderdetails">Consulta</a></li>
                                        <li><a href="actualizarordersdetails.jsp">Actualizar</a></li>
                                        <li><a href="borrarorderdetails.jsp">Borrar</a></li>
                                    </ul>
                         </li>
                         
                         
                           <li>
                                <a href="javascript:;" data-toggle="collapse" data-target="#ordenes"><i class="fa fa-fw fa-arrows-v"></i>Ordenes<i class="fa fa-fw fa-caret-down"></i></a>
                                    <ul id="ordenes" class="collapse">                        
                                        <li><a href="altaorders.jsp">Alta</a></li>
                                        <li><a href="ControladorG?pagina=consultaOrders">Consulta</a></li>
                                        <li><a href="actualizarorders.jsp">Actualizar</a></li>
                                        <li><a href="borrarorders.jsp">Borrar</a></li>
                                    </ul>
                         </li>
                         
                         
                           <li>
                                <a href="javascript:;" data-toggle="collapse" data-target="#pagos"><i class="fa fa-fw fa-arrows-v"></i>Pagos<i class="fa fa-fw fa-caret-down"></i></a>
                                    <ul id="pagos" class="collapse">                        
                                        <li><a href="altapayments.jsp">Alta</a></li>
                                        <li><a href="ControladorG?pagina=consultaPayments">Consulta</a></li>
                                        <li><a href="actualizarpayments.jsp">Actualizar</a></li>
                                        <li><a href="borrarpayments.jsp">Borrar</a></li>
                                    </ul>
                         </li>
                         
                         
                           <li>
                                <a href="javascript:;" data-toggle="collapse" data-target="#lproductos"><i class="fa fa-fw fa-arrows-v"></i>L. Productos<i class="fa fa-fw fa-caret-down"></i></a>
                                    <ul id="lproductos" class="collapse">                        
                                        <li><a href="altacustomers.jsp">Alta</a></li>
                                        <li><a href="ControladorG?pagina=consultaCustomer">Consulta</a></li>
                                        <li><a href="actualizarcustomers.jsp">Actualizar</a></li>
                                        <li><a href="borrarcustomer.jsp">Borrar</a></li>
                                    </ul>
                         </li>
                         
                         
                           <li>
                                <a href="javascript:;" data-toggle="collapse" data-target="#productos"><i class="fa fa-fw fa-arrows-v"></i>Productos<i class="fa fa-fw fa-caret-down"></i></a>
                                    <ul id="productos" class="collapse">                        
                                        <li><a href="altaproducts.jsp">Alta</a></li>
                                        <li><a href="ControladorG?pagina=consultaproducts">Consulta</a></li>
                                        <li><a href="actualizarproducts.jsp">Actualizar</a></li>
                                        <li><a href="borrarproducts.jsp">Borrar</a></li>
                                    </ul>
                         </li>
                         
                </ul>
            </div>
            

            
   
 

 
<!-- menú oculto


                    <li>
                       <a href="charts.html"><i class="fa fa-fw fa-bar-chart-o"></i> Charts</a>
                    </li>
                    <li>
                        <a href="tables.html"><i class="fa fa-fw fa-table"></i> Tables</a>
                    </li>
                    <li>
                        <a href="forms.html"><i class="fa fa-fw fa-edit"></i> Forms</a>
                    </li>
                    <li>
                        <a href="bootstrap-elements.html"><i class="fa fa-fw fa-desktop"></i> Bootstrap Elements</a>
                    </li>
                    <li>
                        <a href="bootstrap-grid.html"><i class="fa fa-fw fa-wrench"></i> Bootstrap Grid</a>
                    </li>
             
                    <li>
                        <a href="blank-page.html"><i class="fa fa-fw fa-file"></i> Blank Page</a>
                    </li>
                    
                    -->
                    
                    
                </ul>
            </div>
              <?php }?>
		
 
    
            <!-- /.navbar-collapse -->
        </nav>


  
  
    
    
    
    
         <div id="page-wrapper">
<!-- aca inserto el codigo que va en la pagina central -->




            

       