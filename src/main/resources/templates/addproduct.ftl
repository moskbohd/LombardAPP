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
            name:<@spring.formInput "form.name" "" "text" />
            <br>
            description:<@spring.formInput "form.description" "" "text" />
            <br>
            <input type="submit" value="Create">

        </form>

    </fieldset>



</div>

</body>
</html>
