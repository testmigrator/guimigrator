import SwiftUI
struct spinner_row: View {
    
    var body: some View {
        Text("")
            .frame(minWidth:0,maxWidth:.infinity)
            .padding(5)
            .font(.system(size: 20))
        .foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))}}

struct spinner_row_Previews: PreviewProvider {
    static var previews: some View {
        spinner_row()
    }
}
