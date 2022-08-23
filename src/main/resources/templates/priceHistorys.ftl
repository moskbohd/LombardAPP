<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>priceHistory</title>
    <style>
        .table-center {
            display: flex;
            place-content: center;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

<h1>Hello, priceHistory! </h1>
<div class="table-center">
    <div class="table-center" style="width: 80%; display: flex; align-content: center">
        <table class="table table-dark table-striped">
            <thead>
            <th> ID </th>
            <th> Price </th>
            <th> Description </th>
            <th> Created At</th>
            <th> DELETE</th>
            <th> EDIT</th>
            </thead>
            <tbody
            <#list priceHistorys as priceHistory >
                <tr>
                    <td>${priceHistory.id!}</td>
                    <td>${priceHistory.price!}</td>
                    <td>${priceHistory.description!}</td>
                    <td>${priceHistory.createdAt!}</td>
                    <td><a href="/ui/v1/priceHistorys/del/${priceHistory.id}"><button type="button" class="btn btn-danger">Del</button></a></td>
                    <td><a href="/ui/v1/priceHistorys/edit/${priceHistory.id}"><button type="button" class="btn btn-info">Edit</button></a></td>
                </tr>
            </#list>
            </tbody>

        </table>
    </div>
</div>

<a href="/ui/v1/products/"><mark>BACK TO PRODUCT</mark></a>
</body>
</html>
