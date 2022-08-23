<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Products</title>
    <style>
        .table-center {
            display: flex;
            place-content: center;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

<h1>Hello, products! </h1>
<div class="table-center">
    <div class="table-center" style="width: 80%; display: flex; align-content: center">
        <table class="table table-dark table-striped">
            <thead>
            <th> ID </th>
            <th> Name </th>
            <th> Product type </th>
            <th> Product condition </th>
            <th> Product weight </th>
            <th> Description </th>
            <th> Created At</th>
            <th> Updated At</th>
            <th> SHOW PRICE</th>
            <th> DELETE</th>
            <th> EDIT</th>
            </thead>
            <tbody
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
                    <td><a href="/ui/v1/priceHistorys/"><button type="button" class="btn btn-danger">SHOW PRICE</button></a></td>
                    <td><a href="/ui/v1/products/del/${product.id}"><button type="button" class="btn btn-danger">Del</button></a></td>
                    <td><a href="/ui/v1/products/edit/${product.id}"><button type="button" class="btn btn-info">Edit</button></a></td>
                </tr>
            </#list>
            </tbody>

        </table>
    </div>
</div>

<a href="/ui/v1/products/add">CREATE</a>
</body>
</html>
