import SwiftUI
struct fragment_wizard_welcome_page: View {

var body: some View {
VStack
{
Text("Welcome to GnuCash")
.overlay(Image("ic_launcher")
.padding(10))
Text("Before you dive in, nlet's setup a few things firstnnTo continue, press Next")
.padding(.top,12)
.font(.system(size: 24))
}}}

struct fragment_wizard_welcome_page_Previews: PreviewProvider {
    static var previews: some View {
        fragment_wizard_welcome_page()
    }
}
