import SwiftUI
struct main_more_content: View {

var body: some View {
VStack
{
Button(action: {})
{
Text("Settings")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(.bottom,1)
Button(action: {})
{
Text("About")
.foregroundColor(.black)
}
.background(Color.blue)
}}}

struct main_more_content_Previews: PreviewProvider {
    static var previews: some View {
        main_more_content()
    }
}
