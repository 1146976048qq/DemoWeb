"use strict";
$(document).ready(function () {
  //+++++++++++++++++++++++++++++++++++++++++++
//     Home 1 Banner Jquery Code Start
//+++++++++++++++++++++++++++++++++++++++++++     
    $("#owl-vesion1-demo").owlCarousel({
//        autoPlay: true,
        navigation: true,
        slideSpeed: 300,
        paginationSpeed: 400,
        singleItem: true,
        items: 1,
        navigationText: ['Prev Post', 'Next Post'],
        pagination: false
    });
//+++++++++++++++++++++++++++++++++++++++++++
//     Isotop Masonry Jquery Start
//+++++++++++++++++++++++++++++++++++++++++++ 
    $(window).load(function () {
        $('.grid8').isotope({
            itemSelector: '.grid-item',
            layout: 'masonry'
        });
    });
//+++++++++++++++++++++++++++++++++++++++++++
//    Countdown Time Jquer Code End
//+++++++++++++++++++++++++++++++++++++++++++
    try {
        $('.xp-counter').appear(function () {
            setTimeout(function () {
                $('#odometer').html(5600);
                $('#odometer2').html(3650);
                $('#odometer3').html(2200);
                $('#odometer4').html(4500);
            }, 1000);
        });
    } catch (err) {
    }
    ;
//+++++++++++++++++++++++++++++++++++++++++++
//     Our Clints Owl Jquery Code Start
//+++++++++++++++++++++++++++++++++++++++++++ 
    $("#our-clints-owl").owlCarousel({
        autoPlay: true,
        navigation: true,
        navigationText: ['<i class="fa fa-angle-left"></i>', '<i class="fa fa-angle-right"></i>'],
        pagination: false,
        items: 4,
        itemsDesktop: [1199, 4],
        itemsDesktopSmall: [979, 4],
        itemsTablet: [767, 3],
        itemsMobile: [479, 2]
    });
//+++++++++++++++++++++++++++++++++++++++++++
//       Countdown Query Code Strat
//+++++++++++++++++++++++++++++++++++++++++++
    $('#event-timer').countdown('2018/10/10', function (event) {
        var $this = $(this).html(event.strftime(''
                + '<ul>'
                + '<div class="col-md-6 col-sm-6 col-xs-6"><div class="row"><li class="days"><span>%D</span> <strong>days</strong></li></div></div>'
                + '<div class="col-md-6 col-sm-6 col-xs-6"><div class="row"><li class="hours"><span>%H</span> <strong>hours</strong></li></div></div>'
                + '<div class="col-md-6 col-sm-6 col-xs-6"><div class="row"><li class="minutes"><span>%M</span> <strong>minutes</strong></li></div></div>'
                + '<div class="col-md-6 col-sm-6 col-xs-6"><div class="row"><li class="seconds"><span>%S</span> <strong>seconds</strong></li></div></div>'
                + '</ul>'));
    });
//+++++++++++++++++++++++++++++++++++++++++++
//      Donaters Help Code Start
//+++++++++++++++++++++++++++++++++++++++++++ 
    $("#donaters-help-owl").owlCarousel({
//        autoPlay: true,
        navigation: false,
        navigationText: false,
        pagination: false,
        items: 3,
        itemsDesktop: [1199, 3],
        itemsDesktopSmall: [979, 2]
    });
    //+++++++++++++++++++++++++++++++++++++++++++
//      Charity News Code Start
//+++++++++++++++++++++++++++++++++++++++++++ 
    $("#charity-news-owl").owlCarousel({
//        autoPlay: true,
        navigation: false,
        navigationText: false,
        pagination: false,
        items: 3,
        itemsDesktop: [1199, 3],
        itemsDesktopSmall: [979, 3]
    });
//+++++++++++++++++++++++++++++++++++++++++++
//     Home 5 Banner Jquery Code Start
//+++++++++++++++++++++++++++++++++++++++++++     
    $("#owl-vesion5-demo").owlCarousel({
//        autoPlay: true,
        navigation: false,
        slideSpeed: 300,
        paginationSpeed: 400,
        singleItem: true,
        items: 1,
        navigationText: false,
        pagination: true
    });
    //+++++++++++++++++++++++++++++++++++++++++++
//      Quantity Jquery  
//+++++++++++++++++++++++++++++++++++++++++++
    $(".ddd").on("click", function () {
        var $button = $(this);
        var oldValue = $button.closest('.sp-quantity').find("input.quntity-input").val();
        if ($button.text() == "+") {
            var newVal = parseFloat(oldValue) + 1;
        } else {
// Don't allow decrementing below zero
            if (oldValue > 0) {
                var newVal = parseFloat(oldValue) - 1;
            } else {
                newVal = 0;
            }
        }
        $button.closest('.sp-quantity').find("input.quntity-input").val(newVal);
    });
//+++++++++++++++++++++++++++++++++++++++++++
//      Swiper slide Jquery  
//+++++++++++++++++++++++++++++++++++++++++++     
    var galleryTop = new Swiper('.gallery-top', {
        nextButton: '.swiper-button-next',
        prevButton: '.swiper-button-prev',
        spaceBetween: 10
    });
    var galleryThumbs = new Swiper('.gallery-thumbs', {
        spaceBetween: 10,
        centeredSlides: true,
        slidesPerView: 'auto',
        touchRatio: 0.2,
        slideToClickedSlide: true
    });
    galleryTop.params.control = galleryThumbs;
    galleryThumbs.params.control = galleryTop;
//+++++++++++++++++++++++++++++++++++++++++++
//    isotop gallry Jquery Code start
//+++++++++++++++++++++++++++++++++++++++++++
    $(window).load(function () {
        var $grid = $('.grid').isotope({
            itemSelector: '.element-item',
            layoutMode: 'fitRows'
        });
// filter functions
        var filterFns = {
            // show if number is greater than 50
            numberGreaterThan50: function () {
                var number = $(this).find('.number').text();
                return parseInt(number, 10) > 50;
            },
            // show if name ends with -ium
            ium: function () {
                var name = $(this).find('.name').text();
                return name.match(/ium$/);
            }
        };
// bind filter button click
        $('#filters').on('click', 'button', function () {
            var filterValue = $(this).attr('data-filter');
            // use filterFn if matches value
            filterValue = filterFns[ filterValue ] || filterValue;
            $grid.isotope({filter: filterValue});
        });
// bind sort button click
        $('#sorts').on('click', 'button', function () {
            var sortByValue = $(this).attr('data-sort-by');
            $grid.isotope({sortBy: sortByValue});
        });
// change is-checked class on buttons
        $('.button-group').each(function (i, buttonGroup) {
            var $buttonGroup = $(buttonGroup);
            $buttonGroup.on('click', 'button', function () {
                $buttonGroup.find('.is-checked').removeClass('is-checked');
                $(this).addClass('is-checked');
            });
        });
    });
    //+++++++++++++++++++++++++++++++++++++++++++
//    isotop gallry Jquery Code start
//+++++++++++++++++++++++++++++++++++++++++++
    $(window).load(function () {
        var $grid = $('.grid2').isotope({
            itemSelector: '.element-item2',
            layoutMode: 'fitRows'
        });

        // filter functions
        var filterFns = {
            // show if number is greater than 50
            numberGreaterThan50: function () {
                var number = $(this).find('.number').text();
                return parseInt(number, 10) > 50;
            },
            // show if name ends with -ium
            ium: function () {
                var name = $(this).find('.name').text();
                return name.match(/ium$/);
            }
        };
// bind filter button click
        $('#filters').on('click', 'button', function () {
            var filterValue = $(this).attr('data-filter');
            // use filterFn if matches value
            filterValue = filterFns[ filterValue ] || filterValue;
            $grid.isotope({filter: filterValue});
        });
// bind sort button click
        $('#sorts').on('click', 'button', function () {
            var sortByValue = $(this).attr('data-sort-by');
            $grid.isotope({sortBy: sortByValue});
        });
// change is-checked class on buttons
        $('.button-group').each(function (i, buttonGroup) {
            var $buttonGroup = $(buttonGroup);
            $buttonGroup.on('click', 'button', function () {
                $buttonGroup.find('.is-checked').removeClass('is-checked');
                $(this).addClass('is-checked');
            });
        });
    });
//+++++++++++++++++++++++++++++++++++++++++++
//     Recent Cause Owl Jquery Code Start
//+++++++++++++++++++++++++++++++++++++++++++ 
    $("#recent-cause-owl").owlCarousel({
//        autoPlay: true,
        navigation: false,
        navigationText: false,
        pagination: false,
        items: 3,
        itemsDesktop: [1199, 3],
        itemsDesktopSmall: [979, 3]
    });
//+++++++++++++++++++++++++++++++++++++++++++
//      Process Owl Jquery Code Start
//+++++++++++++++++++++++++++++++++++++++++++ 
    $("#xp-process-owl").owlCarousel({
//        autoPlay: true,
        navigation: false,
        navigationText: false,
        pagination: false,
        items: 3,
        itemsDesktop: [1199, 3],
        itemsDesktopSmall: [979, 3]
    });
//+++++++++++++++++++++++++++++++++++++++++++
//     Meet Healpers Owl Jquery Code Start
//+++++++++++++++++++++++++++++++++++++++++++ 
    $("#meet-healpers-owl").owlCarousel({
//        autoPlay: true,
        navigation: false,
        navigationText: false,
        pagination: false,
        items: 4,
        itemsDesktop: [1199, 3],
        itemsDesktopSmall: [991, 2],
        itemsTablet: [767, 2],
        itemsMobile: [479, 1]
    });
    //+++++++++++++++++++++++++++++++++++++++++++
//      Charity News Owl Jquery Code Start
//+++++++++++++++++++++++++++++++++++++++++++ 
    $("#xp-charity-news-owl").owlCarousel({
//        autoPlay: true,
        navigation: false,
        navigationText: false,
        pagination: false,
        items: 3,
        itemsDesktop: [1199, 3],
        itemsDesktopSmall: [991, 2],
        itemsTablet: [767, 2]
    });
    //+++++++++++++++++++++++++++++++++++++++++++
//      Welfare Project Owl Jquery Code Start
//+++++++++++++++++++++++++++++++++++++++++++ 
    $("#xp-welfare-project-owl").owlCarousel({
//        autoPlay: true,
        navigation: false,
        navigationText: false,
        pagination: false,
        items: 3,
        itemsDesktop: [1199, 3],
        itemsDesktopSmall: [991, 2],
        itemsTablet: [767, 2]
    });
    //+++++++++++++++++++++++++++++++++++++++++++
//      donat Charity Owl Jquery Code Start
//+++++++++++++++++++++++++++++++++++++++++++ 
    $("#xp-donat-charity-owl").owlCarousel({
//        autoPlay: true,
        navigation: false,
        navigationText: false,
        pagination: false,
        items: 3,
        itemsDesktop: [1199, 3],
        itemsDesktopSmall: [991, 2],
        itemsTablet: [767, 2]
    });
});