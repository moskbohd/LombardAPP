<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Price History</title>
    <style>
        .table-center {
            display: flex;
            place-content: center;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

<h1>Hello, Price History! </h1>
<div class="table-center">
    <div class="table-center" style="width: 80%; display: flex; align-content: center">
        <table class="table table-dark table-striped">
            <thead>
            <th> ID </th>
            <th> Product Name </th>
            <th> Product type </th>
            <th> Product condition </th>
            <th> Product weight </th>
            <th> Product Description </th>
            <th> Price Created At</th>
            <th> DELETE</th>
            <th> EDIT</th>
            </thead>
            <tbody
            <#list priceHistory as priceHistory >
            <tr>
                <td>${priceHistory.id}</td>
                <td>${priceHistory.productName}</td>
                <td>${priceHistory.productType}</td>
                <td>${priceHistory.productCondition}</td>
                <td>${priceHistory.productWeight}</td>
                <td>${priceHistory.productDescription}</td>
                <td>${priceHistory.createdAt!}</td>
                <td>${priceHistory.updatedAt!}</td>
                <td><a href="/ui/v1/priceHistorys/del/${priceHistory.id}"><button type="button" class="btn btn-danger">Del</button></a></td>
                <td><a href="/ui/v1/priceHistorys/edit/${priceHistory.id}"><button type="button" class="btn btn-info">Edit</button></a></td>
            </tr>
        </#list>
        </tbody>

        </table>
    </div>
</div>

<a href="/ui/v1/priceHistory/add">CREATE</a>
</body>
</html>
