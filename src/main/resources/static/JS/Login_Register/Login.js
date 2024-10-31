function Login_Button() {

    const id 	= $('#id').val();
    const pw 	= $('#pw').val();

    let obj = new Object();
    obj.id 		= id;
    obj.pw 		= pw;

    $.ajax({
        url 		: server + '/api/member/regist',
        type 		: 'post',
        data		: JSON.stringify(obj),
        contentType : 'application/json',
        dataType	: 'json',
        success		: function(res) {
            //회원가입 실패시 메시지 출력
            if (res.code != 200) {
                alert(res.message);
                return false;
            }

            location.href="/page/login";
        }
    })
}