<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script>
            $("submit").click(function () {
                $.post("/TechSelect",
                        {
                            name: "Donald Duck",
                            city: "Duckburg"
                        },
                function (data, status) {
                    alert("Data: " + data + "\nStatus: " + status);
                });
            });
        </script>
        <title>Makhtar's JSP test page</title>
    </head>
    <body>
    <center>
        <div class="container">
            <div class="row">
                <div class="col-md-2"></div>

                <div class="col-md-6 jumbotron">
                    <h3>Tech selection page</h3>

                    <form method="POST" class="form-horizontal">
                       
                        <select name="proglang"  class="form-control">
                            <caption > Select programming language:</caption>
                            <option value="c">C</option>
                            <option value="cpp">C++</option>
                            <option value="php">PHP</option>
                        </select>
                        <br><br>

                        <input type="submit" name="submit" class="btn btn-primary">
                    </form>
                    <br>
                    <%= new java.util.Date()%>
                </div>
                <div class="col-md-2"></div>
            </div>
    </center>
</body>
</html>
