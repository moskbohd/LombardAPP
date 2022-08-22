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
            id:<@spring.formInput "form.id" "" "text" />
            <br>
            name:<@spring.formInput "form.name" "" "text" />
            <br>
            description:<@spring.formInput "form.description" "" "text" />
            <br>
            created :<@spring.formInput "form.createdAt" "" "date" />
            <br>
             updated :<@spring.formInput "form.updatedAt" "" "date" />
            <br>

            <input type="submit" value="Save">

        </form>

    </fieldset>



</div>

</body>
</html>
