<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <title>Adding product</title>
</head>
<body class="container-fluid p-4 my-4 bg-gradient text-bg-light">

<p class="h2">Add new product</p>

<div class="container">
    <fieldset>
        <form name="product" action="" method="POST">
            Product name:           <@spring.formInput "form.productName" "" "text" />
            <br>
            Product type:           <@spring.formSingleSelect "form.productType", types ""/>
            <br>
            Product condition:      <@spring.formSingleSelect "form.productCondition", conditions "" />
            <br>
            Product weight:         <@spring.formInput "form.productWeight" "" "double" />
            <br>
            Product description:    <@spring.formInput "form.productDescription" "" "text" />
            <br>
            Created at:<@spring.formInput "form.createdAt"/>
            <br>
            <input  type="submit" value="Save" class="btn-outline-success">
        </form>
    </fieldset>
</div>

<div class="container-fluid p-4 m-auto">
    <a href="/ui/v1/product/products/"><button class="btn-dark-success">BACK</button></a>
</div>

</body>
</html>
