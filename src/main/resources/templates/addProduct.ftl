<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Add new product</h1>

<div>

    <fieldset>
        <form name="product" action="" method="POST">
            productType:<@spring.formSingleSelect "form.productType", types ""/>
            <br>
            productCondition:<@spring.formSingleSelect "form.productCondition", conditions "" />
            <br>
            productName:<@spring.formInput "form.productName" "" "text" />
            <br>
            productWeight:<@spring.formInput "form.productWeight" "" "double" />
            <br>
            productDescription:<@spring.formInput "form.productDescription" "" "text" />
            <br>
            <input type="submit" value="Create">

        </form>

    </fieldset>

</div>

<a href="/ui/v1/products/"><mark>BACK</mark></a>

</body>
</html>
