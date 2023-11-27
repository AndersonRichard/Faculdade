function selectNavItem(element) {

    var navItems = document.getElementsByClassName('nav-item');
    for (var i = 0; i < navItems.length; i++) {
        navItems[i].classList.remove('selected');
    }


    element.classList.add('selected');
}
