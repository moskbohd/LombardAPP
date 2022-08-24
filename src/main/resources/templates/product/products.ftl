<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <title>Products</title>
</head>
<body class="container-fluid p-4 my-4 bg-gradient text-bg-light">

<p class="h2">List of products</p>
<div>
    <table class="table table-striped-columns table-hover table-bordered table-responsive text-center">
        <thead class="bg-dark text-bg-info bg-opacity-50">
            <tr>
                <th class="p-4 bg-gradient text-bg-light">ID</th>
                <th class="p-4 bg-gradient text-bg-light">Name</th>
                <th class="p-4 bg-gradient text-bg-light">Type</th>
                <th class="p-4 bg-gradient text-bg-light">Condition</th>
                <th class="p-4 bg-gradient text-bg-light">Weight</th>
                <th class="p-4 bg-gradient text-bg-light">Description</th>
                <th class="p-4 bg-gradient text-bg-light">Created at</th>
                <th class="p-4 bg-gradient text-bg-light">Updated at</th>
                <th class="p-4 bg-gradient text-bg-light">SHOW PRICE</th>
                <th class="p-4 bg-gradient text-bg-light">DELETE</th>
                <th class="p-4 bg-gradient text-bg-light">EDIT</th>
            </tr>
        </thead>
        <tbody>
            <#list products as product >
                <tr>
                    <td>${product.id}</td>
                    <td>${product.productName}</td>
                    <td>${product.productType}</td>
                    <td>${product.productCondition}</td>
                    <td>${product.productWeight}</td>
                    <td>${product.productDescription}</td>
                    <td>${product.createdAt!}</td>
                    <td>${product.updatedAt!}</td>
                    <td><a href="/ui/v1/price/priceHistorys/${product.id}"><button type="button" class="btn btn-outline-success">SHOW PRICE</button></a></td>
                    <td><a href="/ui/v1/product/products/del/${product.id}"><button type="button" class="btn btn-danger">Del</button></a></td>
                    <td><a href="/ui/v1/product/products/edit/${product.id}"><button type="button" class="btn btn-info">Edit</button></a></td>
                </tr>
            </#list>
        </tbody>
    </table>
</div>

<a href="/ui/v1/product/products/add"><button type="button" class="btn-outline-success">CREATE</button></a>
</body>
</html>
