<html>
<script type="text/javascript" src="https://cdn.goeasy.io/goeasy.js"></script>
<script type="text/javascript">
    var goeasy = new GoEasy({
        appkey: 'fa0074fa-bbcd-4e36-ac4a-0a68d597e086',

    });

    goeasy.subscribe({
        channel: 'abcde',
        onMessage: function (result) {
            receive(result);
        }
    });

    function receive(result){
        alert( result.content);
    }

</script>
<body>
<h2>Hello World!</h2>
</body>
</html>
