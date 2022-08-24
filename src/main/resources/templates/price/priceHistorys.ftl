<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <title>Price history</title>
</head>
<body class="container p-4 my-4 bg-gradient text-bg-light">

<p class="h2">Price history of product</p>
<div>
    <table class="table table-striped-columns table-hover table-bordered table-responsive text-center">
        <thead class="bg-dark text-bg-info bg-opacity-50">
            <th class="p-4 bg-gradient text-bg-light"> ID </th>
            <th class="p-4 bg-gradient text-bg-light"> Price </th>
            <th class="p-4 bg-gradient text-bg-light"> Description </th>
            <th class="p-4 bg-gradient text-bg-light"> Created At</th>
            <th class="p-4 bg-gradient text-bg-light"> DELETE</th>
        </thead>
        <tbody
        <#list items as item>
            <tr>
                <td>${item.id!}</td>
                <td>${item.price!}</td>                <td>${item.description!}</td>
                <td>${item.createdAt!}</td>
                <td><a href="/ui/v1/price/priceHistorys/del/${item.id}"><button type="button" class="btn btn-danger">Del</button></a></td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>

<a href="/ui/v1/product/products/add"><button type="button" class="btn-outline-success">CREATE</button></a>
<a href="/ui/v1/product/products/"><button class="btn-dark btn-sm">BACK TO PRODUCT</button></a>
</body>
</html>
