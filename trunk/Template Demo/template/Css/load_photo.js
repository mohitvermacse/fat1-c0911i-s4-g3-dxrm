var t
function load_photo(p)
{

    xmlHttp=GetXmlHttpObject()

    if (xmlHttp==null)
    {
        alert ("Browser does not support HTTP Request")
        return
    }
    var url="load_photo.php"
    url=url+"?sid="+Math.random()
    url=url+"&p="+p
    //alert(url)
    xmlHttp.onreadystatechange=stateChanged_load_photo
    xmlHttp.open("GET",url,true)
    xmlHttp.send(null)
}

function stateChanged_load_photo()
{
    if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
    {
        document.getElementById("kb_love_card").innerHTML=xmlHttp.responseText
    }
}

function load_image(p)
{

    xmlHttp=GetXmlHttpObject()

    if (xmlHttp==null)
    {
        alert ("Browser does not support HTTP Request")
        return
    }
    var url="load_photo.php"
    url=url+"?sid="+Math.random()
    url=url+"&image_news="+p
    //alert(url)
    xmlHttp.onreadystatechange=stateChanged_load_image
    xmlHttp.open("GET",url,true)
    xmlHttp.send(null)
}

function stateChanged_load_image()
{
    if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
    {
        document.getElementById("image_news").innerHTML=xmlHttp.responseText
    }
}


function load_infor(p)
{

    xmlHttp=GetXmlHttpObject()

    if (xmlHttp==null)
    {
        alert ("Browser does not support HTTP Request")
        return
    }
    var url="load_infor.php"
    url=url+"?sid="+Math.random()
    url=url+"&id="+p
    //alert(url)
    xmlHttp.onreadystatechange=stateChanged_load_infor
    xmlHttp.open("GET",url,true)
    xmlHttp.send(null)
}

function stateChanged_load_infor()
{
    if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
    {
        document.getElementById("infor").innerHTML=xmlHttp.responseText
    }
}


//load city

function load_city(p)
{

    xmlHttp=GetXmlHttpObject()

    if (xmlHttp==null)
    {
        alert ("Browser does not support HTTP Request")
        return
    }
    var url="load_photo.php"
    url=url+"?sid="+Math.random()
    url=url+"&country="+p
    //alert(url)
    xmlHttp.onreadystatechange=stateChanged_load_city
    xmlHttp.open("GET",url,true)
    xmlHttp.send(null)
}

function stateChanged_load_city()
{
    if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
    {
        document.getElementById("city").innerHTML=xmlHttp.responseText
    }
}

