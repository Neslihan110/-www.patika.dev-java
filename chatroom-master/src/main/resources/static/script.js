var stompClient=null



function sendMessage(){


    let jsonOb={
        name:localStorage.getItem("name"),
        content:$("#message-value").val(),
    }
    stompClient.send("/app/message",{},JSON.stringify(jsonOb));
}

function sendMessageWithValue(name,message){


    let jsonOb={
        name:message,
        content:name
    }

    stompClient.send("/app/message",{},JSON.stringify(jsonOb));
}



function connect()
{

    let socket=new SockJS("/server")

    stompClient=Stomp.over(socket)

    stompClient.connect({},function(frame){
        sendMessageWithValue(localStorage.getItem("name"),"Joined")

        $("#name-from").addClass('d-none')
        $("#chat-room").removeClass('d-none')

        stompClient.subscribe("/topic/return-to",function(response){
            showMessage(JSON.parse(response.body))

        })

    })

}


function showMessage(message)
{

    $("#message-container-table").prepend(`<tr><td><b>${message.name} :</b> ${message.content}</td></tr>`)

}





$(document).ready((e)=>{


    $("#login").click(()=>{


        let name=$("#name-value").val()
        localStorage.setItem("name",name)
        $("#name-title").html(`Welcome , <b>${name} </b>`)
        connect();


    })

    $("#login2").click(()=>{


        let name=$("#name-value").val()
        localStorage.setItem("name",name)
        $("#name-title").html(`Welcome , <b>${name} </b>`)
        connect2();


    })
    $("#send-btn").click(()=>{
        if($("#message-value").val() !== '') {
            sendMessage()
        }
        $("#message-value").val('')
    })

    $("#logout").click(()=>{
        sendMessageWithValue(localStorage.getItem("name"),"Disconnected")
        localStorage.removeItem("name")
        if(stompClient!==null)
        {
            stompClient.disconnect()

            $("#name-from").removeClass('d-none')
            $("#chat-room").addClass('d-none')
        }

    })

})