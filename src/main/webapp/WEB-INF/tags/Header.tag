<%@ tag language="java" pageEncoding="UTF-8"%>
<div id='ctl06_portlet_e28a24d5-befe-4213-a3d5-2e1ebcb2a71e' style="width:1000px;float:left"><div>
					
<link href="static/Portlets/NivoSlider/CSS/nivo-slider.css" rel="stylesheet" />
<link href="static/Portlets/NivoSlider/CSS/themes/default.css" rel="stylesheet" />

<script src="static/Portlets/NivoSlider/Scripts/jquery.nivo.slider.js"></script>




<div class="container" style="height:350px;">
    <div class="slider-wrapper theme-default">
        <div id="slider" class="nivoSlider">
          
        <a href="" target="_blank">
                <img src= "static/Resources/imagesPortlet/HNQT3.jpg" title="" /></a>
    
        <a href="" target="_blank">
                <img src= "static/Resources/imagesPortlet/HNQT2.jpg" title="" /></a>
    
        <a href="" target="_blank">
                <img src= "static/Resources/imagesPortlet/HNQT1.jpg" title="" /></a>
    
        </div>
    </div>
</div>
<script language="javascript" type="text/javascript">
    $(document).ready(function(){
        $(".nivoSlider").nivoSlider({
            effect: 'random',
            slices: 15,
            boxCols: 8,
            boxRows: 4,
            animSpeed: 500,
            pauseTime: 3000,
            startSlide: 0,
            directionNav: true,
            controlNav: true,
            controlNavThumbs: false,
            pauseOnHover: true,
            manualAdvance: false,
            prevText: 'Prev',
            nextText: 'Next',
            randomStart: false,
            beforeChange: function () { },
            afterChange: function () { },
            slideshowEnd: function () { },
            lastSlide: function () { },
            afterLoad: function () { }
        });
        $('.nivoSlider').css('height', '350px');
        $('.nivoSlider img').css('height', '350px');
    })
   
</script>
				</div></div>