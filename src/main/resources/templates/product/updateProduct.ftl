<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Update product</h1>

<div>

    <fieldset>
        <form name="product" action="" method="POST">
            productName:<@spring.formInput "form.productName" "" "text" />
            <br>
            productType:<@spring.formSingleSelect "form.productType", types "" />
            <br>
            productCondition:<@spring.formSingleSelect "form.productCondition", conditions "" />
            <br>
            productWeight:<@spring.formInput "form.productWeight" "" "double" />
            <br>
            productDescription:<@spring.formInput "form.productDescription" "" "text" />
            <br>
            createdAt:<@spring.formInput "form.createdAt"/>
            <br>
            <input type="submit" value="Save">

        </form>

    </fieldset>

</div>

<a href="/ui/v1/product/products/"><mark>BACK</mark></a>

</body>
</html>
