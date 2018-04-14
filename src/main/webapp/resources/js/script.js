var prefix = '/students';

var addStudent = function() {
    var JSONObject= {
        'pib':  $("#pib").val(),
        'curse': $("#curse").val()
    };
    console.log(JSONObject);
    $.ajax({
        type: 'POST',
        url:  prefix + '/add',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(JSONObject),
        dataType: 'json',
        async: true,
        success: function(data) {
            alert('Add student ' + data.pib + data.curse);
        },
        error: function(jqXHR, textStatus, errorThrown) {
        alert(jqXHR.status + ' ' + jqXHR.responseText);
    }
});

}
