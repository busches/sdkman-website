// footer
footer(id: 'footer') {
    div(class: 'row') {
        div(class: 'clearfix', "&copy; 2012-${Calendar.instance[Calendar.YEAR]} sdkman/GVM is Open Source Software licensed under ${$a(href: 'http://www.apache.org/licenses/LICENSE-2.0.html', 'Apache 2')}")
        div(class: 'clearfix', "Logos and additional Design by ${$a(href: 'https://github.com/dmesu', 'Daida Medina')}")
    }
}