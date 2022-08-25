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
        <thead class="bg-dark text-bg-info bg-opacity-50 p-4 bg-gradient text-bg-light">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Type</th>
                <th>Condition</th>
                <th>Weight</th>
                <th>Description</th>
                <th>Created at</th>
                <th>Updated at</th>
                <th>SHOW PRICE</th>
                <th>DELETE</th>
                <th>EDIT</th>
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

<div class="container-fluid p-8">
    <a href="/ui/v1/product/products/add"><button type="button" class="btn-success">CREATE NEW PRODUCT</button></a>
</div>

<div class="container p-4 top-100 m-16 h1 text-center">
    <p>
        Pawnshop admin panel for product tracking and product price history.
    </p>
    <p>
        The work was done by Bohdan Moskalskyi.
    </p>
</div>


</body>
</html>
