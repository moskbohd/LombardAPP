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
            productType: (TECHNICS, JEWELER, TOYS, CLOTHES, OTHERS)<@spring.formInput "form.productType" "" "text" />
            <br>
            productCondition: (BELONGTOOWNER, BELONGTOLOMBARD, SOLD)<@spring.formInput "form.productCondition" "" "text" />
            <br>
            productWeight:<@spring.formInput "form.productWeight" "" "double" />
            <br>
            productDescription:<@spring.formInput "form.productDescription" "" "text" />
            <br>
            <input type="submit" value="Save">

        </form>

    </fieldset>

</div>

</body>
</html>
