import SwiftUI
struct spinner_item: View {
    
    var body: some View {
        Text("")
            .frame(minWidth:0,maxWidth:.infinity)
            .padding(5)
            .italic()
            .font(.system(size: 20))
        .foregroundColor(Color(red:0.9411765,green:0.5019608,blue:0.5019608,opacity:1.0))}}

struct spinner_item_Previews: PreviewProvider {
    static var previews: some View {
        spinner_item()
    }
}
