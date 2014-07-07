layout 'layouts/main.groovy', true,
        pageTitle: 'The Groovy programming language - Search',
        mainContent: contents {
            div(id: 'content', class: 'page-1') {
                div(class: 'row') {
                    div(class: 'row-fluid') {
                        div(class: 'col-lg-3') {}

                        div(class: 'col-lg-8 col-lg-pull-0') {
                            h1 'Search'
                            div {
                                script '''
                                  (function() {
                                    var cx = '013939896723962546743:hbhn__olhii';
                                    var gcse = document.createElement('script');
                                    gcse.type = 'text/javascript';
                                    gcse.async = true;
                                    gcse.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') +
                                        '//www.google.com/cse/cse.js?cx=' + cx;
                                    var s = document.getElementsByTagName('script')[0];
                                    s.parentNode.insertBefore(gcse, s);
                                  })();
                                '''
                                'gcse:search'(){}
                                style '''
                                    .gsc-input-box {
                                        height: 30px;
                                    }
                                    input.gsc-search-button, input.gsc-search-button-v2 {
                                        height: 30px;
                                        display: none;
                                    }
                                    .gs-snippet {
                                        margin-left: 8px;
                                    }
                                    .gsc-cursor-page {
                                        margin: 4px;
                                        padding: 4px;
                                        padding-left: 8px;
                                        padding-right: 8px;
                                        border: 1px solid gray;
                                    }
                                    .gsc-selected-option-container {
                                        width: 120px !important;
                                    }
                                    td.gsc-search-button {
                                        padding-top: 6px;
                                    }
                                    td.gsc-orderby-container {
                                        padding-right: 20px;
                                    }
                                    .gs-no-results-result .gs-snippet {
                                        font-weight: bold;
                                        color: #db4800;
                                        background-color: white;
                                        border: 0px;
                                    }
                                '''
                            }
                            hr(class: 'divider')
                        }
                    }
                }
            }
        }